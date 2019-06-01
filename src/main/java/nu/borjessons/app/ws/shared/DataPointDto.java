package nu.borjessons.app.ws.shared;

import nu.borjessons.app.ws.io.entity.YInputArrayEntity;

public class DataPointDto {
	
	private long id;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public YInputArrayEntity getInputDetails() {
		return inputDetails;
	}

	public void setInputDetails(YInputArrayEntity inputDetails) {
		this.inputDetails = inputDetails;
	}

	public Integer getDataPoint() {
		return dataPoint;
	}

	public void setDataPoint(Integer dataPoint) {
		this.dataPoint = dataPoint;
	}

	private YInputArrayEntity inputDetails;
	
	private Integer dataPoint;
}
