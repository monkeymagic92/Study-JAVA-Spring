package com.study.test.like;

import org.apache.ibatis.annotations.Mapper;

import com.study.test.like.model.LikeVO;

@Mapper
public interface LikeMapper {

	int insLike(LikeVO vo);
	
	int delLike(LikeVO vo);
}
