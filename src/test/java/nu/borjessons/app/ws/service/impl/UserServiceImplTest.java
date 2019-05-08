package nu.borjessons.app.ws.service.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import nu.borjessons.app.ws.io.entity.UserEntity;
import nu.borjessons.app.ws.io.repositories.PasswordResetTokenRepository;
import nu.borjessons.app.ws.io.repositories.UserRepository;
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
		//Mockito.doNothing().when(amazonSES).verifyEmail(any(UserDto.class));
 		
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
		assertEquals(storedUserDetails.getAddresses().size(), userEntity.getAddresses().size());
		verify(utils,times(storedUserDetails.getAddresses().size())).generateAddressId(30);
		verify(bCryptPasswordEncoder, times(1)).encode("12345678");
		verify(userRepository,times(1)).save(any(UserEntity.class));
	}

}
