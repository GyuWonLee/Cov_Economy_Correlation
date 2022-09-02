package lastcoder.Entity.Eprate;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
//@Entity 어노테이션을 클래스에 선언하면 그 클래스는 JPA가 관리합니다.
@Table(name = "eprate")
//@Table 어노테이션은 맵핑할 테이블을 지정합니다.
@Getter
@Setter
@NoArgsConstructor
@Component
public class Eprate {

	@EmbeddedId
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private EprateMK eprateMK;
	
	@Column(name = "value")
	private Double value;
}
