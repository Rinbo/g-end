package nu.borjessons.app.ws.shared;

import nu.borjessons.app.ws.io.entity.GraphEntity;

public class XAxisLabelsDto {
	
	private long id;
		
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

	public String getxAxisLabel() {
		return xAxisLabel;
	}

	public void setxAxisLabel(String xAxisLabel) {
		this.xAxisLabel = xAxisLabel;
	}

	private GraphEntity graphDetails;
	
	private String xAxisLabel;
}
