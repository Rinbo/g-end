package nu.borjessons.app.ws.ui.model.request;

import java.util.List;

public class GraphDetailsRequest {

	private String publicId;

	private List<YInputArrayRequestModel> yInputs;

	private List<XAxisLabelsRequestModel> xAxisLabels;
	
	private List<DatasetNamesRequestModel> datasetNames;

	private String xAxisName;

	private String yAxisName;

	private String title;

	public String getPublicId() {
		return publicId;
	}

	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}

	public List<YInputArrayRequestModel> getyInputs() {
		return yInputs;
	}

	public void setyInputs(List<YInputArrayRequestModel> yInputs) {
		this.yInputs = yInputs;
	}

	public List<XAxisLabelsRequestModel> getxAxisLabels() {
		return xAxisLabels;
	}

	public void setxAxisLabels(List<XAxisLabelsRequestModel> xAxisLabels) {
		this.xAxisLabels = xAxisLabels;
	}

	public List<DatasetNamesRequestModel> getDatasetNames() {
		return datasetNames;
	}

	public void setDatasetNames(List<DatasetNamesRequestModel> datasetNames) {
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
