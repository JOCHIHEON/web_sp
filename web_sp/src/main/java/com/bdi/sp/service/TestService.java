package com.bdi.sp.service;

import java.util.List;

import com.bdi.sp.vo.TestVO;

public interface TestService {
	public List<TestVO> getList();
	public void doInsert();
	
}
