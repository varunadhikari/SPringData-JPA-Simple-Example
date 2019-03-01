package com.test.hiber.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.hiber.dao.StudentRepository;
import com.test.hiber.model.Student;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentRepository repository;

	@RequestMapping("/getById/{id}")
	public Optional<Student> getStudentById(@PathVariable Long id) {
		return repository.findById(id);
	}
	
	@RequestMapping("/getAll")
	public List<Student> getAllStudents() {
		return repository.findAll();
	}
	
	@RequestMapping("/getNameById/{id}")
	public String getNameById(@PathVariable Long id) {
		return repository.getNameById(id);
	}
}
