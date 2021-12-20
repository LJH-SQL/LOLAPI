package com.my_project.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

public class APIMapper {
	@Autowired
	private SqlSession sqlSession; 
}
