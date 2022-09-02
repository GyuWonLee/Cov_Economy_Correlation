package lastcoder.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import lastcoder.model.BoardVo;


@Mapper
@Repository("BoardDao")
public interface BoardDao {

	
	public List<BoardVo> selectAllArticles() throws DataAccessException;
	
	public void editArticle(BoardVo boardVo) throws DataAccessException;

}
