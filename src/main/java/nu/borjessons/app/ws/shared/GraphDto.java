package nu.borjessons.app.ws.shared;

import java.util.List;

public class GraphDto  {
	
	private long id;
	
	private String publicId;
		
	private List<YInputArrayDto> yInputs;
	
	private List<XAxisLabelsDto> xAxisLabels;
		
	private List<DatasetNamesDto> datasetNames;
	
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

	public List<YInputArrayDto> getyInputs() {
		return yInputs;
	}

	public void setyInputs(List<YInputArrayDto> yInputs) {
		this.yInputs = yInputs;
	}

	public List<XAxisLabelsDto> getxAxisLabels() {
		return xAxisLabels;
	}

	public void setxAxisLabels(List<XAxisLabelsDto> xAxisLabels) {
		this.xAxisLabels = xAxisLabels;
	}

	public List<DatasetNamesDto> getDatasetNames() {
		return datasetNames;
	}

	public void setDatasetNames(List<DatasetNamesDto> datasetNames) {
		this.datasetNames = datasetNames;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	private String xAxisName;
	
	private String yAxisName;
	
	private String title;

}
