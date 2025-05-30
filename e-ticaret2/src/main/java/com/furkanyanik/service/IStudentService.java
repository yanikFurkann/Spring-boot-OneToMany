package com.furkanyanik.service;

import java.util.List;

import com.furkanyanik.entity.Student;

public interface IStudentService {

	public Student createStudent(Student student);
	
	public List<Student> getAllStudent();
	
	public Student getStudent(Integer id);
	
	public void deleteStudent(Integer id);
	
	public Student updateStudent(Integer id, Student student);
	
	
}
