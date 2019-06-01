package nu.borjessons.app.ws.shared;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import nu.borjessons.app.ws.io.entity.DatasetNames;
import nu.borjessons.app.ws.io.entity.XAxisLabels;
import nu.borjessons.app.ws.io.entity.YInputArrayEntity;

public class GraphDto  {
	
	private long id;
	
	private String publicId;
		
	private List<YInputArrayEntity> yInputs;
	
	private List<XAxisLabels> xAxisLabels;
		
	private List<DatasetNames> datasetNames;
	
	private String xAxisName;
	
	private String yAxisName;
	
	private String title;

}
