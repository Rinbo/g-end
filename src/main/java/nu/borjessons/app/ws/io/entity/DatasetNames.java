package nu.borjessons.app.ws.io.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "dataset_names")
public class DatasetNames implements Serializable {

	private static final long serialVersionUID = 2829058230515236716L;
	
	@Id
	@GeneratedValue
	private long id;
}
