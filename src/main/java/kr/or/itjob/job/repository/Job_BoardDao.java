package kr.or.itjob.job.repository;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.or.itjob.model.ItJobComUsersVo;
import kr.or.itjob.model.Job_BoardVo;
import kr.or.itjob.model.PageVo;

@Repository("jobBoardDao")
public class Job_BoardDao implements Job_BoardDaoI{
	
	@Resource(name="sqlSessionTemplate")
	private SqlSessionTemplate template;

	@Override
	public List<Job_BoardVo> PagingJob_Board(PageVo pageVo) {
		return template.selectList("jobBoard.pagingJob_Board", pageVo);
	}

	@Override
	public int CountAllJob_Board() {
		return  template.selectOne("jobBoard.countAllJob_Board");
	}

	@Override
	public List<Job_BoardVo> selectJob_Board(Job_BoardVo job_BoardVo) {
		return template.selectList("jobBoard.selectjob_Board", job_BoardVo);
	}

	@Override
	public List<ItJobComUsersVo> selectjob_BoardCom(String com_id) {
		return template.selectList("jobBoard.selectjob_BoardCom",com_id);
	}
	
	
	
	
	
	

}
