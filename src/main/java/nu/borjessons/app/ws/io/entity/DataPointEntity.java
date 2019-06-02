package nu.borjessons.app.ws.io.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity(name = "data_points")
public class DataPointEntity implements Serializable {

	private static final long serialVersionUID = 1901509617290187239L;
	
	@Id
	@GeneratedValue
	private long id;
	
	@ManyToOne
	@JoinColumn(name="y_inputs_id")
	@JsonBackReference
	private YInputArrayEntity inputDetails;
	
	private Integer dataPoint;
	
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


}
