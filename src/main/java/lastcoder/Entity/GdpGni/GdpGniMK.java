package lastcoder.Entity.GdpGni;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Embeddable
@Component
public class GdpGniMK implements Serializable{

	@Column(name = "kor_gdpgni")
	private String kor_gdpgni;
	
	@Column(name = "year")
	private String year;
	
	@Column(name = "quarter")
	private String quarter;
	
}
