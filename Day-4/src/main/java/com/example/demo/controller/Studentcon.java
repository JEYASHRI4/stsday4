package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.Studentser;

@RestController
public class Studentcon {
@Autowired	
	Studentser ser;
@PostMapping("add")
public Student add(@RequestBody Student  s) {
	return ser.saveinfo(s);
}
@GetMapping("show")
public List<Student> show(){
	return ser.show();
}

}
