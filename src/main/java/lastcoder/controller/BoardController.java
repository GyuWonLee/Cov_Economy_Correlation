package lastcoder.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import lastcoder.model.BoardVo;
import lastcoder.service.BoardService;



@Controller
@RequestMapping("index/board")
public class BoardController {

	
	@Autowired
	BoardService boardservice;
	
	@Autowired
	List<BoardVo> boardlist;
	
	List<BoardVo> boardlist_tmp;
	
	ModelAndView mv;
	
	@RequestMapping(value = "/page1", method = RequestMethod.POST)
	public ModelAndView getBoard1to10(@RequestParam(value ="boardlist") List<BoardVo> boardlist) {
		boardlist_tmp = new ArrayList<>();
		
		for(BoardVo tmp : boardlist) {
			if(1 <= tmp.getId() & 10 >= tmp.getId()) {
				boardlist_tmp.add(tmp);
			}
		}
		mv.addObject("boardlist_tmp",boardlist_tmp);
		mv.setViewName("page1");
		return mv;
	}
	
	@RequestMapping(value = "/page2", method = RequestMethod.POST)
	public ModelAndView getBoard11to20(@RequestParam(value ="boardlist") List<BoardVo> boardlist) {
		boardlist_tmp = new ArrayList<>();
		
		for(BoardVo tmp : boardlist) {
			if(11 <= tmp.getId() & 20 >= tmp.getId()) {
				boardlist_tmp.add(tmp);
			}
		}
		mv.addObject("boardlist_tmp",boardlist_tmp);
		mv.setViewName("page2");
		return mv;
	}
	
}
