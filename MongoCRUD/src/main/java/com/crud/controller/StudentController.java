package com.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.entity.Student;
import com.crud.repo.IStudentRepository;

@RestController
public class StudentController {

	@Autowired
	private IStudentRepository studentRepository;
	
	@PostMapping("/addstudent")
	public ResponseEntity<?> addStudent(@RequestBody Student student){
		Student save = this.studentRepository.save(student);
		return ResponseEntity.ok(save);
	}
	
	@GetMapping("/getstudents")
	public ResponseEntity<?> getStudents(){
		return ResponseEntity.ok(this.studentRepository.findAll());
	}
	
	@PutMapping("/updatestudent/{id}")
	public ResponseEntity<Student> updateStudent(@PathVariable int id,@RequestBody Student student){
		Student updatestudent = this.studentRepository.findById(id).get();
		updatestudent.setCity(student.getCity());
		updatestudent.setCollege(student.getCollege());
		updatestudent.setId(student.getId());
		updatestudent.setName(student.getName());
		this.studentRepository.save(updatestudent);
		return ResponseEntity.ok(updatestudent);
		
	}
}
