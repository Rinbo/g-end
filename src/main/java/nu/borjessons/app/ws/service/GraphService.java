package nu.borjessons.app.ws.service;

import nu.borjessons.app.ws.shared.GraphDto;

public interface GraphService {

	GraphDto createGraph(GraphDto graphDto);

	GraphDto getByPublicString(String publicString);

}
