package lastcoder.Entity.Sidocode;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Embeddable
@Component
public class SidoCodeMK implements Serializable {

	@Column(name = "sidocode")
	private String sidocode;
	
	@Column(name = "sidoname")
	private String sidoname;
	
	
}
