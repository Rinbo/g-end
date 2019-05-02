package nu.borjessons.app.ws.service.impl;

import java.util.ArrayList;

import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import nu.borjessons.app.ws.io.entity.UserEntity;
import nu.borjessons.app.ws.io.repositories.UserRepository;
import nu.borjessons.app.ws.service.UserService;
import nu.borjessons.app.ws.shared.AmazonSES;
import nu.borjessons.app.ws.shared.UserDto;
import nu.borjessons.app.ws.shared.Utils;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	Utils utils;
	
	@Override
	public UserDto createUser(UserDto user) {
				
		if (userRepository.findByEmail(user.getEmail()) != null) throw new RuntimeException("Record already exists");
		
		ModelMapper modelMapper = new ModelMapper();
		UserEntity userEntity = modelMapper.map(user, UserEntity.class);
		
		String publicUserId = utils.generateUserId(30);
		
		userEntity.setUserId(publicUserId);
		userEntity.setEmailVerificationToken(utils.generateEmailVerificationToken(publicUserId));
		userEntity.setEmailVerificationStatus(false);
		userEntity.setEncryptedPassword(bCryptPasswordEncoder.encode(user.getPassword()));
				
		userEntity.setUserId(publicUserId);
		UserEntity storedUserDetails = userRepository.save(userEntity);
				
		UserDto returnValue = modelMapper.map(storedUserDetails, UserDto.class);
		
		new AmazonSES().verifyEmail(returnValue);
		
		return returnValue;
	}
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		UserEntity userEntity = userRepository.findByEmail(email);
		if (userEntity == null) throw new UsernameNotFoundException(email);
		
		return new User(userEntity.getEmail(), userEntity.getEncryptedPassword(), userEntity.getEmailVerificationStatus(),
				true, true,
				true, new ArrayList<>());
		
		//return new User(userEntity.getEmail(), userEntity.getEncryptedPassword(), new ArrayList<>());
	}
	
	@Override
	public UserDto getUser(String email) {
		UserEntity userEntity = userRepository.findByEmail(email);
		if (userEntity == null) throw new UsernameNotFoundException(email);
		UserDto returnValue = new UserDto();
		BeanUtils.copyProperties(userEntity, returnValue);
		return returnValue;
		
	}

	@Override
	public boolean verifyEmailToken(String token) {
		 boolean returnValue = false;

	        // Find user by token
	        UserEntity userEntity = userRepository.findUserByEmailVerificationToken(token);

	        if (userEntity != null) {
	            boolean hastokenExpired = Utils.hasTokenExpired(token);
	            if (!hastokenExpired) {
	                userEntity.setEmailVerificationToken(null);
	                userEntity.setEmailVerificationStatus(Boolean.TRUE);
	                userRepository.save(userEntity);
	                returnValue = true;
	            }
	        }

	        return returnValue;
	}
	
}
