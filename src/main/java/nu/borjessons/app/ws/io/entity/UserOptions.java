package nu.borjessons.app.ws.io.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity(name = "user_options")

public class UserOptions implements Serializable {

	private static final long serialVersionUID = 2792068313078575947L;
	
	@Id
	@GeneratedValue
	private long id;
	
	@OneToOne
	@JoinColumn(name="graphs_id")
	@JsonBackReference
	private GraphEntity graphDetails;
	
	private boolean fillColor;

	private String color;
	
	private String graphType;

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
