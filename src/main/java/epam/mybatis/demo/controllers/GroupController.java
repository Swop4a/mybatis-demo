package epam.mybatis.demo.controllers;

import epam.mybatis.demo.mappers.GroupMapper;
import epam.mybatis.demo.model.Group;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/groups")
public class GroupController {

	@Autowired
	private GroupMapper groupMapper;

	@GetMapping("get/{id}")
	public Group getGroup(@PathVariable Long id) {
		return groupMapper.getGroup(id);
	}

	@GetMapping("getAll")
	public List<Group> getAllGroups() {
		return groupMapper.findAll();
	}
}
