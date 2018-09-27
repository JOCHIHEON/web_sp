package com.bdi.sp.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.bdi.sp.dao.TestDAO;
import com.bdi.sp.vo.BoardInfoVO;
import com.bdi.sp.vo.TestVO;

@Repository
public class TestDAOImpl implements TestDAO {
	
	@Override
	public List<TestVO> getList() {
		ClassPathXmlApplicationContext cpac = 
				new ClassPathXmlApplicationContext("classpath:spring/application-config.xml");
		SqlSession ss = (SqlSession)cpac.getBean("sst");
		ss.getConnection();
		return ss.selectList("TEST.selectTest");
	}
	
	@Override
	public int doInsert() {
		// TODO Auto-generated method stub
		return 0;
	}

}
