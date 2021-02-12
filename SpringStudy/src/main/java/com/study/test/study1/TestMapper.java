package com.study.test.study1;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {

	int test(TestVO vo);
	
	List<TestPARAM> selTest();
}
