package epam.mybatis.demo.model;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Faculty {

	COMPUTER_SCIENCE_AND_IT(1, "CC&IT", "Faculty computer science and IT"),
	MECHANICAL_AND_MATHEMATICS(2, "MaM", "Mechanical and Mathematics");

	@Getter
	private int id;

	@Getter
	private String name;

	@Getter
	private String description;

	private static final Map<Integer, Faculty> FACULTY_MAP = Stream.of(values())
		.collect(
			Collectors.toMap(Faculty::getId, v -> v));

	public static Faculty forValue(int id) {
		return FACULTY_MAP.get(id);
	}
}
