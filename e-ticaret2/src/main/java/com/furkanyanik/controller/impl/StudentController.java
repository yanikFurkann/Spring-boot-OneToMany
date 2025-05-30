package com.furkanyanik.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.furkanyanik.controller.IStudentController;
import com.furkanyanik.entity.Student;
import com.furkanyanik.repository.StudentRepository;
import com.furkanyanik.service.IStudentService;

import jakarta.transaction.Transactional;
@RestController
@RequestMapping("/rest/api/student")


public class StudentController implements IStudentController {
@Autowired

IStudentService studentService ;

@Autowired
StudentRepository studentRepository;

@PostMapping("/save")
@Override
public Student createStudent(@RequestBody Student student) {
	
return	studentService.createStudent(student);
	
	
}

@GetMapping ("/list")

@Override
public List<Student> getAllStudent() {

return studentService.getAllStudent();
	
}
@GetMapping("/list{id}")
@Override
public Student getStudent(@PathVariable  Integer id) {
	
	return studentService.getStudent(id);
	
}

@DeleteMapping("/list{id}")
@Override
public void deleteStudent(@PathVariable Integer id) {
studentService.deleteStudent(id);
	
}

@PutMapping("/put{id}")
@Override
public Student updateStudent(@PathVariable Integer id, @RequestBody Student student) {
	
return	studentService.updateStudent(id, student);
	
	
	
}

@GetMapping("/students/{id}")
public ResponseEntity<Student> getStudentWithSubjects(@PathVariable Integer id) {
    Student student = studentRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Student not found"));
    
    student.getSubjects().size();
    
    return ResponseEntity.ok(student);




}

	
}
