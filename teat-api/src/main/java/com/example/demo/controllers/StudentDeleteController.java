package com.example.demo.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.StudentRegistration;

@RestController
public class StudentDeleteController {
	
	@RequestMapping(method = RequestMethod.DELETE, value="/delete/student/{regdNum}")
	@ResponseBody
	public String deleteStudentRecord(@PathVariable("regdNum") String regdNum) {
		System.out.println("In deleteStudentRecord");   
	    return StudentRegistration.getInstance().deleteStudent(regdNum);
	}

}
