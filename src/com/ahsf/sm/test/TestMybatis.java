package com.ahsf.sm.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ahsf.sm.bean.Student;
import com.ahsf.sm.mapper.StudentMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/spring/applicationContext-*.xml")
public class TestMybatis {

	@Autowired
	private SqlSession sqlSession ;
	
	@Test
	public void testSession(){
		StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
		List<Student> all = mapper.getAll();
		System.out.println(all);
	}
	
}
