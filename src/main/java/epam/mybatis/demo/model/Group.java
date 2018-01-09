package epam.mybatis.demo.model;

import java.util.List;
import lombok.Data;

@Data
public class Group {

	private Long id;
	private String name;
	private Faculty faculty;
	private List<Student> students;
	private List<Teacher> teachers;
}
