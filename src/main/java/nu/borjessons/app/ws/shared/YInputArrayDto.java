package nu.borjessons.app.ws.shared;

import java.util.List;

import nu.borjessons.app.ws.io.entity.GraphEntity;

public class YInputArrayDto {
		
	private long id;
		
	private GraphEntity graphDetails;	
	
	private List<DataPointDto> dataPoints;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public GraphEntity getGraphDetails() {
		return graphDetails;
	}

	public void setGraphDetails(GraphEntity graphDetails) {
		this.graphDetails = graphDetails;
	}

	public List<DataPointDto> getDataPoints() {
		return dataPoints;
	}

	public void setDataPoints(List<DataPointDto> dataPoints) {
		this.dataPoints = dataPoints;
	}

}
