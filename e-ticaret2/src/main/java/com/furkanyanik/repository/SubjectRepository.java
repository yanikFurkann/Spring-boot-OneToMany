package com.furkanyanik.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.furkanyanik.entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Integer>{

	List<Subject> findAllByName(String name);


}
