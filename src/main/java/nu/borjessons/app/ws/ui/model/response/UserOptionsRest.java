package nu.borjessons.app.ws.ui.model.response;

public class UserOptionsRest {
	private boolean fillColor;

	private String color;

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
}
