package kr.or.itjob.log.repository;

import java.util.List;

import kr.or.itjob.model.ItJobUserVo;


public interface ItJobUserDaoI {
	
	// 전체 사용자 조회(하섭)
	List<ItJobUserVo> selectAllUser();
	
	// 사용자 한명의 조회(하섭)
	ItJobUserVo selectUser(String users_id);
	
}
