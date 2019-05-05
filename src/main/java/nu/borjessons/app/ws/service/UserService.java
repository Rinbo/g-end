package nu.borjessons.app.ws.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import nu.borjessons.app.ws.shared.UserDto;

public interface UserService extends UserDetailsService {
	UserDto createUser(UserDto user);
	UserDto getUser(String email);
	boolean verifyEmailToken(String token);
	boolean requestPasswordReset(String email);
	boolean resetPassword(String token, String password);
}
