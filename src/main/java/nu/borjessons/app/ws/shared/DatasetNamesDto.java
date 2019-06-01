package nu.borjessons.app.ws.shared;

public class DatasetNamesDto {
	
	private long id;
	private String datasetName;
	private GraphDto graphDetails;
	
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

	public String getDatasetName() {
		return datasetName;
	}

	public void setDatasetName(String datasetName) {
		this.datasetName = datasetName;
	}

}
