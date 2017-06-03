package com.ahsf.sm.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ahsf.sm.service.StudentService;

public class TestSpring {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext-*.xml");
		StudentService studentService = (StudentService) ac.getBean("studentService");
		System.out.println(studentService);
	}
}
