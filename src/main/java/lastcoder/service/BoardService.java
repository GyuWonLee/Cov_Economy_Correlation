package lastcoder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lastcoder.dao.BoardDao;
import lastcoder.model.BoardVo;

@Service("TestServcie")
@Transactional
public class BoardService {

	private BoardDao boardDao;
	
	@Autowired
	public BoardService(BoardDao boardDao) {
		this.boardDao = boardDao;
	}
	
	public List<BoardVo> listArticle(){
		List<BoardVo> articleList = boardDao.selectAllArticles();
		
		return articleList;
	}
	
	public void	editArticle(BoardVo boardVo) {
		boardDao.editArticle(boardVo);
	}
}
