package nu.borjessons.app.ws.io.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "axis_names")
public class AxisNames implements Serializable {

	private static final long serialVersionUID = -4508396009050574183L;
	
	@Id
	@GeneratedValue
	private long id;

}