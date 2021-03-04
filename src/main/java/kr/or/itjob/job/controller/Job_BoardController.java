package kr.or.itjob.job.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.or.itjob.job.service.Job_BoardServiceI;
import kr.or.itjob.model.PageVo;
/**
 * jobBoard
 * 만든이 : 백수진
 * @return
 */
@Controller	
@RequestMapping("job_Board")
public class Job_BoardController {
	
	@Resource(name="jobBoardService")
	private Job_BoardServiceI job_BoardService;
	
	@RequestMapping("job_Main")
	public String Main() {
		return "/itjob/main";
	}
		
	@RequestMapping(path ="job_BoardList", method = RequestMethod.GET)
	public String pagingJob_Board(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int pageSize,
			Model model) {
		 model.addAllAttributes(job_BoardService.PagingJob_Board(new PageVo(page, pageSize)));
		 return "/itjob/board";
	}
	
	
	@RequestMapping(path = "detailjob_Board", method = RequestMethod.GET)
	public String detailjob_Board(Model model) {
		model.addAllAttributes(job_BoardService.selectJob_Board(null));
		return "/itjob/job_details";
	}
	
	

}
