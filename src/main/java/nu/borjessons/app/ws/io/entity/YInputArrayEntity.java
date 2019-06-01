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

@Entity(name = "y_inputs")
public class YInputArrayEntity implements Serializable {

	private static final long serialVersionUID = 2642682003693654379L;
	
	@Id
	@GeneratedValue
	private long id;
	
	@ManyToOne
	@JoinColumn(name="graphs_id")
	private GraphEntity graphDetails;
	
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

	@OneToMany(mappedBy="inputDetails", cascade=CascadeType.ALL)
	private List<DataPointEntity> dataPoints;
	}
