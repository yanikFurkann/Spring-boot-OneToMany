package com.furkanyanik.service;

import java.util.List;

import com.furkanyanik.entity.Subject;

public interface ISubjectService  {

	public Subject createSubject(Subject subject);
	
	public List<Subject> subjectAll();
	
	public Subject getSubject(Integer id );
	
	public List<Subject> getSubjectByName(String name);
	
	public Subject getSubjectById(Integer id);
	
	public Subject createBySubject(Subject subject, Integer studentId);
	

	
	
	
}
