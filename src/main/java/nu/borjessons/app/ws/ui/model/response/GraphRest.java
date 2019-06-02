package nu.borjessons.app.ws.ui.model.response;

import java.util.List;

import nu.borjessons.app.ws.io.entity.DatasetNames;
import nu.borjessons.app.ws.io.entity.XAxisLabels;
import nu.borjessons.app.ws.io.entity.YInputArrayEntity;

public class GraphRest {
	private String publicString;

	private List<YInputArrayEntity> yInputs;

	private List<XAxisLabels> xAxisLabels;
	
	private List<DatasetNames> datasetNames;

	private String xAxisName;

	private String yAxisName;

	private String title;

	public String getPublicString() {
		return publicString;
	}

	public void setPublicString(String publicString) {
		this.publicString = publicString;
	}

	public List<YInputArrayEntity> getyInputs() {
		return yInputs;
	}

	public void setyInputs(List<YInputArrayEntity> yInputs) {
		this.yInputs = yInputs;
	}

	public List<XAxisLabels> getxAxisLabels() {
		return xAxisLabels;
	}

	public void setxAxisLabels(List<XAxisLabels> xAxisLabels) {
		this.xAxisLabels = xAxisLabels;
	}

	public List<DatasetNames> getDatasetNames() {
		return datasetNames;
	}

	public void setDatasetNames(List<DatasetNames> datasetNames) {
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
