package nu.borjessons.app.ws.ui.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nu.borjessons.app.ws.shared.UserDto;
import nu.borjessons.app.ws.ui.model.request.GraphDetailsRequest;
import nu.borjessons.app.ws.ui.model.request.UserDetailsRequestModel;
import nu.borjessons.app.ws.ui.model.response.UserRest;

@CrossOrigin
@RestController
@RequestMapping(path= "/graphs")
public class GraphController {

	@PostMapping
	public UserRest createUser(@RequestBody GraphDetailsRequest graphDetails) {
				
		UserRest returnValue = new UserRest();		
		ModelMapper modelMapper = new ModelMapper();
		UserDto userDto = modelMapper.map(userDetails, UserDto.class);
		UserDto createdUser = userService.createUser(userDto);
		BeanUtils.copyProperties(createdUser, returnValue);
		return returnValue;
		
	}
	
}
