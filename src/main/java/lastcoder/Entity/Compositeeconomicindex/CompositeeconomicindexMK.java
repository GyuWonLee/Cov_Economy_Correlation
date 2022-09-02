package lastcoder.Entity.Compositeeconomicindex;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
@Component
public class CompositeeconomicindexMK implements Serializable {

	@Column(name = "ce_index")
	private String ce_index;
	
	@Column(name = "year")
	private String year;
	
	@Column(name = "month")
	private String month;
}
