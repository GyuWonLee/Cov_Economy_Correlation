package lastcoder.Entity.EmploymentRate;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Embeddable
@Component
public class EmploymentrateMK implements Serializable {

	@Column(name = "id")
	private String id;
	
	@Column(name = "year")
	private String year;
	
	@Column(name = "month")
	private String month;
	
}
