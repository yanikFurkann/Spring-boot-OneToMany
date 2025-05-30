package com.furkanyanik.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.furkanyanik.controller.ISubjectController;
import com.furkanyanik.entity.Student;
import com.furkanyanik.entity.Subject;
import com.furkanyanik.repository.StudentRepository;
import com.furkanyanik.repository.SubjectRepository;
import com.furkanyanik.service.ISubjectService;

@RestController
@RequestMapping("/rest/api/subject")



public class SubjectController implements ISubjectController {
@Autowired
	private ISubjectService subjectService;

	
	@PostMapping("/save")
	@Override
	public Subject createSubject(  @RequestBody Subject subject) {

return subjectService.createSubject(subject);
			
	}

	

@GetMapping("/list")
	@Override
	public List<Subject> subjectAll() {
		// TODO Auto-generated method stub
		return subjectService.subjectAll();
	}


@GetMapping("/list{id}")
@Override
public Subject getSubject(  @PathVariable Integer id) {


	return subjectService.getSubject(id);
}

@GetMapping("/name")
@Override
public ResponseEntity<List<Subject>> getSubjectByName(@RequestParam ("name") String name) {
	
	List<Subject> subjectList=subjectService.getSubjectByName(name);
	
return	ResponseEntity.ok(subjectList);
	
	
}

@GetMapping("/id{id}")
@Override
public Subject getSubjectById(@PathVariable() Integer id) {
return	subjectService.getSubjectById(id);
	
}


@PostMapping("/create")
@Override
public Subject createBySubject(@RequestBody Subject subject,@RequestParam Integer studentId) {
	
	return subjectService.createBySubject(subject, studentId);
	
	}

}







