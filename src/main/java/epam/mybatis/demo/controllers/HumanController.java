package epam.mybatis.demo.controllers;

import epam.mybatis.demo.mappers.HumanMapper;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import epam.mybatis.demo.model.Human;

@Slf4j
@RestController
@RequestMapping("/human")
public class HumanController {

	@Autowired
	private HumanMapper humanMapper;

	@GetMapping("get/{id}")
	public Human getHuman(@PathVariable Long id) {
		return humanMapper.getHuman(id);
	}

	@GetMapping("getAll")
	public List<Human> getAllHumans() {
		return humanMapper.findAllHumans();
	}

	@PostMapping("update")
	public ResponseEntity update(@RequestBody Human human) {
		log.info("Update human with id: {}", human.getId());
		int i = humanMapper.updateHuman(human.getId(), human);

		if (i == 0) {
			log.error("Cannot update human {}", human.getId());
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
		log.info("Update successful {}", human);
		return new ResponseEntity(HttpStatus.OK);
	}

	@PostMapping("create")
	public ResponseEntity insert(@RequestBody Human human) {
		log.info("Insert human {}", human);
		int i = humanMapper.insertHuman(human);

		if (i == 0) {
			log.info("Cannot insert human {}", human.getId());
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
		log.info("Insert successful {}", human);
		return new ResponseEntity(HttpStatus.OK);
	}
}
