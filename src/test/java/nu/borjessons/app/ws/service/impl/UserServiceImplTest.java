package nu.borjessons.app.ws.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import nu.borjessons.app.ws.io.entity.UserEntity;
import nu.borjessons.app.ws.io.repositories.UserRepository;
import nu.borjessons.app.ws.shared.AmazonSES;
import nu.borjessons.app.ws.shared.UserDto;
import nu.borjessons.app.ws.shared.Utils;

class UserServiceImplTest {
	
	@InjectMocks
	UserServiceImpl userService;

	@Mock
	UserRepository userRepository;
	
	@Mock
	BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Mock
	Utils utils;
	
	@Mock
	AmazonSES amazonSES;
	
	UserEntity userEntity;
	String userId = "hhty57ehfy";
	String encryptedPassword = "74hghd8474jf";
	
	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		
		userEntity = new UserEntity();
		userEntity.setId(1L);
		userEntity.setUserId("1323kjlkedf");
		userEntity.setFirstName("Robin");
		userEntity.setLastName("Börjesson");
		userEntity.setEncryptedPassword(encryptedPassword);
		userEntity.setEmail("test@test.com");
		userEntity.setEmailVerificationToken("7htnfhr758");
		
	}

	@Test
	void testGetUser() {
		
		when(userRepository.findByEmail(anyString())).thenReturn(userEntity);

		UserDto userDto = userService.getUser("test@test.com");
		assertNotNull(userDto);
		assertEquals("Robin", userDto.getFirstName());
		assertEquals("Börjesson", userDto.getLastName());
	}

	@Test
	void testGetUser_UserNameNotFoundException() {
		when(userRepository.findByEmail(anyString())).thenReturn(null);

		assertThrows(UsernameNotFoundException.class,

				() -> {
					userService.getUser("test@test.com");
				}

		);
	}
	
	@Test
	final void testCreateUser()
	{
		when(userRepository.findByEmail(anyString())).thenReturn(null);	
		when(utils.generateUserId(anyInt())).thenReturn(userId);
		when(bCryptPasswordEncoder.encode(anyString())).thenReturn(encryptedPassword);
		when(userRepository.save(any(UserEntity.class))).thenReturn(userEntity);
		Mockito.doNothing().when(amazonSES).verifyEmail(any(UserDto.class));
 		
		UserDto userDto = new UserDto();
		
		userDto.setFirstName("Robin");
		userDto.setLastName("Börjesson");
		userDto.setPassword("12345678");
		userDto.setEmail("test@test.com");

		UserDto storedUserDetails = userService.createUser(userDto);
		assertNotNull(storedUserDetails);
		assertEquals(userEntity.getFirstName(), storedUserDetails.getFirstName());
		assertEquals(userEntity.getLastName(), storedUserDetails.getLastName());
		assertNotNull(storedUserDetails.getUserId());	
		verify(bCryptPasswordEncoder, times(1)).encode("12345678");
		verify(userRepository,times(1)).save(any(UserEntity.class));
	}
	
	@Test
	final void testCreateUser_CreateUserServiceException()
	{
		when(userRepository.findByEmail(anyString())).thenReturn(userEntity);
		UserDto userDto = new UserDto();		
		userDto.setFirstName("Robin");
		userDto.setLastName("Börjsson");
		userDto.setPassword("12345678");
		userDto.setEmail("test@test.com");
 	
		assertThrows(RuntimeException.class,

				() -> {
					userService.createUser(userDto);
				}

		);
	}

}
