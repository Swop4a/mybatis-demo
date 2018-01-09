package epam.mybatis.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import lombok.Data;

@Data
public class Teacher {

	private Long id;
	private String name;
	private String moniker;

	@JsonIgnore
	private List<Group> groups;
}
