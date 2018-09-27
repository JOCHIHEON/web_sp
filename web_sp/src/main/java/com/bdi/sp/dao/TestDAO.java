package com.bdi.sp.dao;

import java.util.List;

import com.bdi.sp.vo.TestVO;

public interface TestDAO {
	public List<TestVO> getList();
	public int doInsert();
}
