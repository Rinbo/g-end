package nu.borjessons.app.ws.service.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import nu.borjessons.app.ws.io.entity.GraphEntity;
import nu.borjessons.app.ws.io.repositories.GraphRepository;
import nu.borjessons.app.ws.service.GraphService;
import nu.borjessons.app.ws.shared.DataPointDto;
import nu.borjessons.app.ws.shared.DatasetNamesDto;
import nu.borjessons.app.ws.shared.GraphDto;
import nu.borjessons.app.ws.shared.XAxisLabelsDto;
import nu.borjessons.app.ws.shared.YInputArrayDto;

@Service
public class GraphServiceImpl implements GraphService {

	@Autowired
	GraphRepository graphRepository;

	@Override
	public GraphDto createGraph(GraphDto graph) {
		
		if (graphRepository.findByPublicString(graph.getPublicString()) != null) throw new RuntimeException("Record already exists");
		
		for (int i = 0; i < graph.getyInputs().size(); i++) {
			YInputArrayDto yArray = graph.getyInputs().get(i);
			yArray.setGraphDetails(graph);
			graph.getyInputs().set(i, yArray);		

			List<DataPointDto> dataPoints = yArray.getDataPoints();
			for (int j = 0; j < dataPoints.size(); j++) {
				DataPointDto dataPoint = dataPoints.get(j);
				dataPoint.setInputDetails(yArray);				
			}
		}
		
		for (int i = 0; i<graph.getxAxisLabels().size(); i++) {
			XAxisLabelsDto xLabel = graph.getxAxisLabels().get(i);
			xLabel.setGraphDetails(graph);
			graph.getxAxisLabels().set(i, xLabel);
		}

		for (int i = 0; i < graph.getDatasetNames().size(); i++) {
			DatasetNamesDto datasetName = graph.getDatasetNames().get(i);
			datasetName.setGraphDetails(graph);
			graph.getDatasetNames().set(i, datasetName);
		}

		ModelMapper modelMapper = new ModelMapper();
		GraphEntity graphEntity = modelMapper.map(graph, GraphEntity.class);

		GraphEntity storedGraphDetails = graphRepository.save(graphEntity);

		GraphDto returnValue = modelMapper.map(storedGraphDetails, GraphDto.class);

		return returnValue;
	}

	@Override
	public GraphDto getByPublicString(String publicString) {
		GraphEntity graphEntity = graphRepository.findByPublicString(publicString);
		
		if (graphEntity == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Could not find graph");
		
		ModelMapper modelMapper = new ModelMapper();
		GraphDto returnValue = modelMapper.map(graphEntity, GraphDto.class);
		
		return returnValue;		
	}
}
