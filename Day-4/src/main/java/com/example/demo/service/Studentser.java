package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.Studentrep;

@Service
public class Studentser {
	@Autowired
    Studentrep stu;
	public Student saveinfo(Student s) {
		return stu.save(s);
	}
	public List<Student> show(){
		return stu.findAll();
	}
}
