package nu.borjessons.app.ws.ui.model.response;

import java.util.List;

public class GraphRest {
	private String publicString;

	private List<YInputArrayRest> yInputs;

	private List<XAxisLabelsRest> xAxisLabels;
	
	private List<DatasetNamesRest> datasetNames;

	private String xAxisName;

	private String yAxisName;

	private String title;

	public String getPublicString() {
		return publicString;
	}

	public void setPublicString(String publicString) {
		this.publicString = publicString;
	}

	public List<YInputArrayRest> getyInputs() {
		return yInputs;
	}

	public void setyInputs(List<YInputArrayRest> yInputs) {
		this.yInputs = yInputs;
	}

	public List<XAxisLabelsRest> getxAxisLabels() {
		return xAxisLabels;
	}

	public void setxAxisLabels(List<XAxisLabelsRest> xAxisLabels) {
		this.xAxisLabels = xAxisLabels;
	}

	public List<DatasetNamesRest> getDatasetNames() {
		return datasetNames;
	}

	public void setDatasetNames(List<DatasetNamesRest> datasetNames) {
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
}
