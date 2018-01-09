package epam.mybatis.demo.handlers;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import epam.mybatis.demo.model.Faculty;

public class FacultyTypeHandler extends BaseTypeHandler<Faculty>{

	@Override
	public void setNonNullParameter(PreparedStatement preparedStatement, int i, Faculty faculty, JdbcType jdbcType)
		throws SQLException {
		preparedStatement.setInt(i, faculty.getId());
	}

	@Override
	public Faculty getNullableResult(ResultSet resultSet, String s) throws SQLException {
		return Faculty.forValue(resultSet.getInt(s));
	}

	@Override
	public Faculty getNullableResult(ResultSet resultSet, int i) throws SQLException {
		return Faculty.forValue(resultSet.getInt(i));
	}

	@Override
	public Faculty getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
		return Faculty.forValue(callableStatement.getInt(i));
	}
}
