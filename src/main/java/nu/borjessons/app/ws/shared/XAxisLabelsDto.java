package nu.borjessons.app.ws.shared;

public class XAxisLabelsDto {
	
	private long id;
	private String xAxisLabel;	
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

	public String getxAxisLabel() {
		return xAxisLabel;
	}

	public void setxAxisLabel(String xAxisLabel) {
		this.xAxisLabel = xAxisLabel;
	}
	
}
