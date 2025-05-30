package com.furkanyanik.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.furkanyanik.entity.Student;
import com.furkanyanik.repository.StudentRepository;
import com.furkanyanik.service.IStudentService;


@Service
public class StudentService implements IStudentService {
@Autowired
	private StudentRepository studentRepository;

@Override
public Student createStudent(Student student) {

	return studentRepository.save(student);

	
}

@Override
public List<Student> getAllStudent() {
	List<Student> students= studentRepository.findAll();
	
	return students;

}

@Override
public Student getStudent(Integer id) {

	Optional<Student> studentOptional= studentRepository.findById(id);
	if (studentOptional.isPresent()) {
		return studentOptional.get();
	}
	
	return null;
	
}

@Override
public void deleteStudent(Integer id) {
	
	studentRepository.deleteById(id);
	

}

@Override
public Student updateStudent(Integer id, Student student) {

 Optional<Student> optional=  studentRepository.findById(id);
		  
		  
		  
if (optional.isPresent()) {
	
	Student dbStudent=new Student();
	
	
	dbStudent.setName(student.getName());
		
	return studentRepository.save(dbStudent);
	
}
	return null;
}


	
	
}
