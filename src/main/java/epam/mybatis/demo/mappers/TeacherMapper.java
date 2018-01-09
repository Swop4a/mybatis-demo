package epam.mybatis.demo.mappers;

import epam.mybatis.demo.model.Teacher;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import epam.mybatis.demo.model.Teacher;

public interface TeacherMapper {

	Teacher get(@Param("id") Long id);

	List<Teacher> findAll();
}
