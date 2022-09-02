package lastcoder.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import lastcoder.model.TestVO;


@Mapper
@Repository("TestDao")
public interface TestDao {

	
	public List<TestVO> selectAllArticles() throws DataAccessException;

}
