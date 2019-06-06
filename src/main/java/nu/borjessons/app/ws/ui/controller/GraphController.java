package nu.borjessons.app.ws.ui.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nu.borjessons.app.ws.service.GraphService;
import nu.borjessons.app.ws.shared.GraphDto;
import nu.borjessons.app.ws.ui.model.request.GraphDetailsRequest;
import nu.borjessons.app.ws.ui.model.response.GraphRest;

@RestController
@RequestMapping(path= "/graphs")
@CrossOrigin(origins="*")
public class GraphController {

	@Autowired
	GraphService graphService;
	
	@GetMapping(path = "/{publicString}")
	public GraphRest getGraph(@PathVariable String publicString) {
		
		GraphDto graphDto = graphService.getByPublicString(publicString);
		
		ModelMapper modelMapper = new ModelMapper();
		GraphRest returnValue = modelMapper.map(graphDto, GraphRest.class);
		
		return returnValue;
	}
	
	@PostMapping	
	public GraphRest createUser(@RequestBody GraphDetailsRequest graphDetails) {
				
		ModelMapper modelMapper = new ModelMapper();
		GraphDto graphDto = modelMapper.map(graphDetails, GraphDto.class);
		GraphDto createGraph = graphService.createGraph(graphDto);
		GraphRest returnValue = modelMapper.map(createGraph, GraphRest.class);
		return returnValue;	
	}
	
}
