package epam.mybatis.demo.mappers;

import epam.mybatis.demo.model.Group;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import epam.mybatis.demo.model.Group;

public interface GroupMapper {

	Group getGroup(@Param("groupId") Long id);

	List<Group> findAll();
}
