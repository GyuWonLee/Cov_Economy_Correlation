
package lastcoder.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component()
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BoardVo {

	private int id;
	private String name;
	private String email;
	private String message;
	private String subject;
	
}
