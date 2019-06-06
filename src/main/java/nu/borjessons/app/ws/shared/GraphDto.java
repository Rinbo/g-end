package nu.borjessons.app.ws.shared;

import java.util.List;

public class GraphDto  {
	
	private long id;
	
	private String publicString;	
	
	private List<YInputArrayDto> yInputs;
	
	private List<XAxisLabelsDto> xAxisLabels;
		
	private List<DatasetNamesDto> datasetNames;
	
	private UserOptionsDto userOptions;
	
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

	public UserOptionsDto getUserOptions() {
		return userOptions;
	}

	public void setUserOptions(UserOptionsDto userOptions) {
		this.userOptions = userOptions;
	}

}
