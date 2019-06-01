package nu.borjessons.app.ws.shared;

import java.util.List;

public class YInputArrayDto {
		
	private long id;
		
	private GraphDto graphDetails;	
	
	private List<DataPointDto> dataPoints;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public GraphDto getGraphDetails() {
		return graphDetails;
	}

	public void setGraphDetails(GraphDto graphDetails) {
		this.graphDetails = graphDetails;
	}

	public List<DataPointDto> getDataPoints() {
		return dataPoints;
	}

	public void setDataPoints(List<DataPointDto> dataPoints) {
		this.dataPoints = dataPoints;
	}

}
