package nu.borjessons.app.ws.ui.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nu.borjessons.app.ws.service.UserService;
import nu.borjessons.app.ws.shared.dto.UserDto;
import nu.borjessons.app.ws.ui.model.request.UserDetailsRequestModel;
import nu.borjessons.app.ws.ui.model.response.UserRest;

@CrossOrigin
@RestController
@RequestMapping("users")
public class UserController {
	
	@Autowired
	UserService userService;	
	
	@GetMapping
	public String getUser() {
		return "Get user was called";
	}
	
	@PostMapping
	public UserRest createUser(@RequestBody UserDetailsRequestModel userDetails) {
		UserRest returnValue = new UserRest();
		UserDto userDto = new UserDto();
		BeanUtils.copyProperties(userDetails, userDto);
		UserDto createdUser = userService.createUser(userDto);
		BeanUtils.copyProperties(createdUser, returnValue);
		return returnValue;
		
	}
	
	@PutMapping
	public String updateUser() {
		return "Update user was called";
	}
	
	@DeleteMapping
	public String deleteUser() {
		return "Delete user was called";
	}

}
