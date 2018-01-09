package epam.mybatis.demo.controllers;

import epam.mybatis.demo.mappers.TeacherMapper;
import epam.mybatis.demo.model.Teacher;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

	@Autowired
	private TeacherMapper teacherMapper;

	@GetMapping("get/{id}")
	public Teacher getTeacher(@PathVariable Long id) {
		return teacherMapper.get(id);
	}

	@GetMapping("getAll")
	public List<Teacher> getAllTeachers() {
		return teacherMapper.findAll();
	}
}
