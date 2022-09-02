package lastcoder.Entity.Eprate;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Embeddable
@Component
public class EprateMK implements Serializable {

	
	@Column(name = "id")
	private String id;
	
	@Column(name = "year")
	private String year;
	
	@Column(name = "month")
	private String month;
}
