package nu.borjessons.app.ws.io.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity(name = "dataset_names")
public class DatasetNames implements Serializable {

	private static final long serialVersionUID = 2829058230515236716L;
	
	@Id
	@GeneratedValue
	private long id;
	
	@ManyToOne
	@JoinColumn(name="graphs_id")
	@JsonBackReference
	private GraphEntity graphDetails;
	
	private String datasetName;

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

	public String getDatasetName() {
		return datasetName;
	}

	public void setDatasetName(String datasetName) {
		this.datasetName = datasetName;
	}
}
