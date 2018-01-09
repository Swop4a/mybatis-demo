package epam.mybatis.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Student extends Human {

	private Long studentCardNumber;
	private byte courseNumber;

	@JsonIgnore
	private Group group;
}
