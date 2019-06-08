package nu.borjessons.app.ws.ui.model.request;

public class UserOptionsRequestModel {
	
	private boolean fillColor;
	
	private String color;
	
	private String graphType;

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

	public String getGraphType() {
		return graphType;
	}

	public void setGraphType(String graphType) {
		this.graphType = graphType;
	}

}
