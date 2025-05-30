package com.furkanyanik.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.furkanyanik.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{

}
