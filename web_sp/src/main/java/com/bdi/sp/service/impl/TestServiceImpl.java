package com.bdi.sp.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdi.sp.dao.TestDAO;
import com.bdi.sp.service.TestService;
import com.bdi.sp.vo.TestVO;

@Service
public class TestServiceImpl implements TestService {
	@Autowired
	private TestDAO tdao;
	
	@Override
	public List<TestVO> getList() {
		tdao.getList();
		return tdao.getList();
	}
	
	@Override
	public void doInsert() {

	}

}
