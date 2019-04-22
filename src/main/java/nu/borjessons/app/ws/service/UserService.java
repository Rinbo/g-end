package nu.borjessons.app.ws.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import nu.borjessons.app.ws.shared.dto.UserDto;

public interface UserService extends UserDetailsService {
	UserDto createUser(UserDto user);
	UserDto getUser(String email);
}
