package nu.borjessons.app.ws.io.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "x_axis_labels")
public class XAxisLabels implements Serializable {

	private static final long serialVersionUID = -9004482706068171500L;
	
	@Id
	@GeneratedValue
	private long id;
	
	@ManyToOne
	@JoinColumn(name="graphs_id")
	private GraphEntity graphDetails;
	
	private String xAxis;
	private String yAxis;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public GraphEntity getGraphDetails() {
		return graphDetails;
	}
	public void setGraphDetails(GraphEntity graphDetails) {
		this.graphDetails = graphDetails;
	}
	public String getxAxis() {
		return xAxis;
	}
	public void setxAxis(String xAxis) {
		this.xAxis = xAxis;
	}
	public String getyAxis() {
		return yAxis;
	}
	public void setyAxis(String yAxis) {
		this.yAxis = yAxis;
	}
}
