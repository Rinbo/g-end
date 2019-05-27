package nu.borjessons.app.ws.io.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "x_axis_labels")
public class XAxisLabels implements Serializable {

	private static final long serialVersionUID = -9004482706068171500L;
	@Id
	@GeneratedValue
	private long id;
}
