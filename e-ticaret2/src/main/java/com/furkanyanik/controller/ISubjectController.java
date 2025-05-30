package com.furkanyanik.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.furkanyanik.entity.Subject;

public interface ISubjectController {

	public Subject createSubject(Subject subject);
	
	public List<Subject> subjectAll();
	
	public Subject getSubject(Integer id );
	
	public ResponseEntity<List<Subject>>  getSubjectByName(String name);
	
	public Subject getSubjectById(Integer id);
	
	public Subject createBySubject(Subject subject, Integer studentid);
	
	
}
