package lastcoder.Entity.UniversityGraduate;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Embeddable
@Component
public class UniversityGraduateMK implements Serializable{

	@Column(name = "ugemprate")
	private String ugemprate;
	
	@Column(name = "year")
	private String year;
}
