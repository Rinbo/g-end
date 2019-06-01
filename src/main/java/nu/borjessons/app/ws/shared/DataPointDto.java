package nu.borjessons.app.ws.shared;

public class DataPointDto {
	
	private long id;
	private YInputArrayDto inputDetails;	
	private Integer dataPoint;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public YInputArrayDto getInputDetails() {
		return inputDetails;
	}

	public void setInputDetails(YInputArrayDto inputDetails) {
		this.inputDetails = inputDetails;
	}

	public Integer getDataPoint() {
		return dataPoint;
	}

	public void setDataPoint(Integer dataPoint) {
		this.dataPoint = dataPoint;
	}


}
