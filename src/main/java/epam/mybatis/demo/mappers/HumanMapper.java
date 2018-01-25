package epam.mybatis.demo.mappers;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import epam.mybatis.demo.model.Human;
import epam.mybatis.demo.model.Student;

public interface HumanMapper {

	Integer sum(@Param("id") Long id);

	Human getHuman(@Param("id") Long id);

	List<Human> findAllHumans();

	int insertHuman(@Param("person") Human human);

	int updateHuman(@Param("id") Long id, @Param("to") Human human);

	Student getStudent(@Param("id") Long id);

	List<Student> findAllStudents();
}
