package lastcoder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import lastcoder.model.BoardVo;
import lastcoder.service.BoardService;

@Controller
@RequestMapping("/index")
public class IndexController {

		
	@Autowired
	BoardService boardService;
	
	@Autowired
	BoardVo boardVo;
	
	@Autowired
	List<BoardVo> boardlist;
	
	
	@RequestMapping("")
	public String getIndex( ) {
		return "index";
	}
	
	@RequestMapping("/feature")
	public String getFeature( ) {
		return "feature";
	}
	
	@RequestMapping("/about")
	public String getAbout( ) {
		return "about";
	}
	@RequestMapping("/appointment")
	public String getAppointment( ) {
		return "appointment";
	}
	@RequestMapping("/testimonial")
	public String getTestImonial( ) {
		return "testimonial";
	}
	@RequestMapping("/team")
	public String getTeam( ) {
		return  "team";
	}
	
	
	
	@RequestMapping("/contact")
	public String getContact( ) {
		return "contact";
	}
	
	@RequestMapping(value = "/board/addArticle", method = RequestMethod.POST)
	public String addArticle(@RequestParam(value = "name") String name, @RequestParam(value = "email") String email,
							@RequestParam(value = "subject") String subject , @RequestParam(value = "message") String message) {
		boardVo.setEmail(email);
		boardVo.setMessage(message);
		boardVo.setName(name);
		boardVo.setSubject(subject);
		boardService.editArticle(boardVo);
		return "redirect:/index/board";
	}
	
	@RequestMapping("/board")
	public ModelAndView BoardList() {
		boardlist = boardService.listArticle();
		ModelAndView mv = new ModelAndView();
		mv.addObject("boardlist",boardlist);
		mv.setViewName("board");
		return mv;
	}
	
	
	
}
