package dao.user;

import org.apache.ibatis.annotations.Param;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public interface UserDao {
	public void insertUser(@Param("id")int id, @Param("name")String name) ;
//	{
//		JdbcTemplate template = getJdbcTemplate();
//		template.execute("insert into users values(" + id + ",'" + name + "')");
//	}O
}
