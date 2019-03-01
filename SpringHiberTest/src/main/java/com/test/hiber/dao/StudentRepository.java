package com.test.hiber.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.test.hiber.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

	@Query("select s.name FROM Student s WHERE s.id = :id")
	String getNameById(@Param("id") Long id) ;
}
