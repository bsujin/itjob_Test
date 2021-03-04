package kr.or.itjob.job.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.ResultMap;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import kr.or.itjob.job.repository.Job_BoardDao;
import kr.or.itjob.log.repository.ItJobComUsersDao;
import kr.or.itjob.model.Job_BoardVo;
import kr.or.itjob.model.PageVo;

@Service("jobBoardService")
public class Job_BoardService implements Job_BoardServiceI {

	@Resource(name="jobBoardDao")
	private Job_BoardDao job_BoardDao;
	
	
	// 게시글 페이징 처리 
	@Override
	public Map<String, Object> PagingJob_Board(PageVo pageVo) {
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		resultMap.put("pageVo", pageVo);
		resultMap.put("jobList", job_BoardDao.PagingJob_Board(pageVo));
		resultMap.put("pagination", (int)Math.ceil( (double)job_BoardDao.CountAllJob_Board() / pageVo.getPageSize()));
		return resultMap;
	}

	//구인 구직 글 상세 조회
	@Override
	public Map<String, Object> selectJob_Board(Job_BoardVo job_BoardVo) {
		Map<String, Object> detailjob = new HashMap<String, Object>();
		detailjob.put("detailJobList",job_BoardDao.selectJob_Board(job_BoardVo));
		detailjob.put("detailComList", job_BoardDao.selectjob_BoardCom(job_BoardVo.getCom_id()));
		
		return detailjob;
	}
	
	
}
