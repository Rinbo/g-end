package nu.borjessons.app.ws.ui.model.response;

import java.util.List;

public class YInputArrayRest {
	private List<DataPointRest> dataPoints;

	public List<DataPointRest> getDataPoints() {
		return dataPoints;
	}

	public void setDataPoints(List<DataPointRest> dataPoints) {
		this.dataPoints = dataPoints;
	}
}
