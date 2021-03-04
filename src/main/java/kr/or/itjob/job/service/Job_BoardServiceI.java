package kr.or.itjob.job.service;

import java.util.List;
import java.util.Map;

import kr.or.itjob.model.Job_BoardVo;
import kr.or.itjob.model.PageVo;

public interface Job_BoardServiceI {
	
	// 구인 구직 글 목록 -  페이징 처리 
	 Map<String, Object>PagingJob_Board(PageVo pageVo);
	 
	// 구인 구직 글 상세조회
	 Map<String, Object> selectJob_Board(Job_BoardVo job_BoardVo);
			
	// 구인 구직 글 등록
	
	// 구인 구직 글 수정
	
	// 구인 구직 글 삭제
	
	
}
