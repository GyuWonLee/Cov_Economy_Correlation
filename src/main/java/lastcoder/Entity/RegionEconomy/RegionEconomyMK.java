package lastcoder.Entity.RegionEconomy;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Embeddable
@Component
public class RegionEconomyMK implements Serializable {

	@Column(name = "sidocode")
	private String sidocode;
	
	@Column(name = "year")
	private String year;
	
	@Column(name = "month")
	private String month;
	
	
	
}
