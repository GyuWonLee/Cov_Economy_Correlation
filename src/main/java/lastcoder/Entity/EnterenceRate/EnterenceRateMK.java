package lastcoder.Entity.EnterenceRate;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Embeddable
@Component
public class EnterenceRateMK implements Serializable{

	
	@Column(name = "ent_rate_fac")
	private String ent_rate_fac;
	
	@Column(name = "year")
	private String year;
	
}
