package nu.borjessons.app.ws.io.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "graphs")
public class GraphEntity implements Serializable {

	private static final long serialVersionUID = -3169233863830903797L;
	
	@Id
	@GeneratedValue
	private long id;
	
	private String publicId;
	
	@OneToMany(mappedBy="graphDetails", cascade=CascadeType.ALL)
	private List<YInputArrayEntity> yInputs;

	private XAxisLabels xAxisLabels;
	
	private DatasetNames datasetNames;
	
	private AxisNames axisNames;
	
	private String title;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPublicId() {
		return publicId;
	}

	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}
	
	public List<YInputArrayEntity> getyInputs() {
		return yInputs;
	}

	public void setyInputs(List<YInputArrayEntity> yInputArrayEntities) {
		this.yInputs = yInputArrayEntities;
	}

	public XAxisLabels getxAxisLabels() {
		return xAxisLabels;
	}

	public void setxAxisLabels(XAxisLabels xAxisLabels) {
		this.xAxisLabels = xAxisLabels;
	}

	public DatasetNames getDatasetNames() {
		return datasetNames;
	}

	public void setDatasetNames(DatasetNames datasetNames) {
		this.datasetNames = datasetNames;
	}

	public AxisNames getAxisNames() {
		return axisNames;
	}

	public void setAxisNames(AxisNames axisNames) {
		this.axisNames = axisNames;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
