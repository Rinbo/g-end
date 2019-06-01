package nu.borjessons.app.ws.shared;

import nu.borjessons.app.ws.io.entity.GraphEntity;

public class DatasetNamesDto {
	
	private long id;
	
	private GraphEntity graphDetails;
	
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

	public String getDataSetName() {
		return dataSetName;
	}

	public void setDataSetName(String dataSetName) {
		this.dataSetName = dataSetName;
	}

	private String dataSetName;
}
