package nu.borjessons.app.ws.shared;

public class UserOptionsDto {

	private long id;
	
	private boolean fillColor;

	private String color;
	
	private GraphDto graphDetails;	

	public boolean isFillColor() {
		return fillColor;
	}

	public void setFillColor(boolean fillColor) {
		this.fillColor = fillColor;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

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
}
