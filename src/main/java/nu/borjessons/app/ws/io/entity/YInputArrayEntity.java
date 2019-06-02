package nu.borjessons.app.ws.io.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity(name = "y_inputs")
public class YInputArrayEntity implements Serializable {

	private static final long serialVersionUID = 2642682003693654379L;

	@Id
	@GeneratedValue
	private long id;

	@ManyToOne
	@JoinColumn(name = "graphs_id")
	@JsonBackReference
	private GraphEntity graphDetails;

	@OneToMany(mappedBy = "inputDetails", cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<DataPointEntity> dataPoints;

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

	public List<DataPointEntity> getDataPoints() {
		return dataPoints;
	}

	public void setDataPoints(List<DataPointEntity> dataPoints) {
		this.dataPoints = dataPoints;
	}

}
