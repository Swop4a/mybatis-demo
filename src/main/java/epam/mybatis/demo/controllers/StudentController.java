package epam.mybatis.demo.controllers;

import epam.mybatis.demo.mappers.HumanMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import epam.mybatis.demo.model.Student;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private HumanMapper humanMapper;

	@GetMapping("get/{id}")
	public Student getStudent(@PathVariable Long id) {
		return humanMapper.getStudent(id);
	}

	@GetMapping("getAllStudents")
	public List<Student> getAllStudents() {
		return humanMapper.finaAllStudents();
	}
}
