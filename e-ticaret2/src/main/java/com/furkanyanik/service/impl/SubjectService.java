package com.furkanyanik.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.furkanyanik.entity.Student;
import com.furkanyanik.entity.Subject;
import com.furkanyanik.repository.SubjectRepository;
import com.furkanyanik.service.IStudentService;
import com.furkanyanik.service.ISubjectService;
@Service

public class SubjectService implements ISubjectService {
@Autowired
	private SubjectRepository subjectRepository;

@Autowired
private  IStudentService studentService;


	@Override
	public Subject createSubject(Subject subject) {
 return subjectRepository.save(subject);

	
	}

	@Override
	public List<Subject> subjectAll() {
		// TODO Auto-generated method stub
		return subjectRepository.findAll();
	}

	@Override
	public Subject getSubject(Integer id) {
	Optional<Subject> optional=	subjectRepository.findById(id);
		
		if (optional.isPresent()) {
			return optional.get();
		}
		
		
		return null;
	}

	@Override
	public List<Subject> getSubjectByName(String name) {
		
		return subjectRepository.findAllByName(name);
		
		
	
	}

	@Override
	public Subject getSubjectById(Integer id) {
		
	Optional<Subject> optionalSubject=	 subjectRepository.findById(id);
		
	return optionalSubject.orElse(null);
	
	}

	@Override
	public Subject createBySubject(Subject subject, Integer studentId) {
Student student = studentService.getStudent(studentId);
subject.setStudent(student);

return subjectRepository.save(subject);

		
		
		
	}



	
}
