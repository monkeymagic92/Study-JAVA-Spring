package com.study.test.study1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

	@Autowired
	private TestMapper mapper;
	
	public int test(TestVO vo) {
		return mapper.test(vo);
	}
	
	public List<TestPARAM> selTest() {
		return mapper.selTest();
	}
}
