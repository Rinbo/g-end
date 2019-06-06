package nu.borjessons.app.ws.io.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity(name = "graphs")
public class GraphEntity implements Serializable {

	private static final long serialVersionUID = -3169233863830903797L;
	
	@Id
	@GeneratedValue
	private long id;
	
	private String publicString;
	
	@OneToMany(mappedBy="graphDetails", cascade=CascadeType.ALL)
	@JsonManagedReference
	private List<YInputArrayEntity> yInputs;
	
	@OneToMany(mappedBy="graphDetails", cascade=CascadeType.ALL)
	@JsonManagedReference
	private List<XAxisLabels> xAxisLabels;

	@OneToMany(mappedBy="graphDetails", cascade=CascadeType.ALL)
	@JsonManagedReference
	private List<DatasetNames> datasetNames;
	
	@OneToOne(mappedBy="graphDetails", cascade=CascadeType.ALL)
	@JsonManagedReference
	private UserOptions userOptions;
	
	private String xAxisName;
	
	private String yAxisName;
	
	private String title;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPublicString() {
		return publicString;
	}

	public void setPublicString(String publicString) {
		this.publicString = publicString;
	}
	
	public List<YInputArrayEntity> getyInputs() {
		return yInputs;
	}

	public void setyInputs(List<YInputArrayEntity> yInputArrayEntities) {
		this.yInputs = yInputArrayEntities;
	}

	public List<XAxisLabels> getxAxisLabels() {
		return xAxisLabels;
	}

	public void setxAxisLabels(List<XAxisLabels> xAxisLabels) {
		this.xAxisLabels = xAxisLabels;
	}

	public String getxAxisName() {
		return xAxisName;
	}

	public void setxAxisName(String xAxisName) {
		this.xAxisName = xAxisName;
	}

	public String getyAxisName() {
		return yAxisName;
	}

	public void setyAxisName(String yAxisName) {
		this.yAxisName = yAxisName;
	}

	public List<DatasetNames> getDatasetNames() {
		return datasetNames;
	}

	public void setDatasetNames(List<DatasetNames> datasetNames) {
		this.datasetNames = datasetNames;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public UserOptions getUserOptions() {
		return userOptions;
	}

	public void setUserOptions(UserOptions userOptions) {
		this.userOptions = userOptions;
	}
}
