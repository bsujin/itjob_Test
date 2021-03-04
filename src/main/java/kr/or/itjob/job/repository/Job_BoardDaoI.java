package kr.or.itjob.job.repository;

import java.util.List;

import kr.or.itjob.model.ItJobComUsersVo;
import kr.or.itjob.model.Job_BoardVo;
import kr.or.itjob.model.PageVo;

public interface Job_BoardDaoI {
	
	// 게시판 페이징 처리
	List<Job_BoardVo> PagingJob_Board(PageVo pageVo);
	
	// 전체 게시판 갯수 조회
	int CountAllJob_Board();
	
	// 게시글 상세 조회
	List<Job_BoardVo> selectJob_Board(Job_BoardVo job_BoardVo);
	
	// 게시글에 해당하는 기업 조회
	List<ItJobComUsersVo> selectjob_BoardCom(String com_id);
	
	
}
