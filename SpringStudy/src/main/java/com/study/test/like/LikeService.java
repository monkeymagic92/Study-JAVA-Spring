package com.study.test.like;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.test.like.model.LikeVO;

@Service
public class LikeService {

	@Autowired
	private LikeMapper mapper;
	
	// 좋아요 등록
	public int insLike(LikeVO vo) {
		return mapper.insLike(vo);
	}
	
	// 좋아요 취소
	public int delLike(LikeVO vo) {
		return mapper.delLike(vo);
	}
}
