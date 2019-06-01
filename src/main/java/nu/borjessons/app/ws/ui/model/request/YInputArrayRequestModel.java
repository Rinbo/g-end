package nu.borjessons.app.ws.ui.model.request;

import java.util.List;

public class YInputArrayRequestModel {
	
	private List<DataPointRequestModel> dataPoints;

	public List<DataPointRequestModel> getDataPoints() {
		return dataPoints;
	}

	public void setDataPoints(List<DataPointRequestModel> dataPoints) {
		this.dataPoints = dataPoints;
	}

}
