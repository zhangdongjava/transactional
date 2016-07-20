package dao.log;

import org.apache.ibatis.annotations.Param;

public interface LogDao  {
	public void insertLog(@Param("id")int id, @Param("context")String content) ;
}
