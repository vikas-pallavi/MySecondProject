package com.example.demo.service;

import com.example.demo.Entity.Student;
import com.example.demo.dto.StudentDto;

public interface StudentService {
  
	 String save(StudentDto dto);
	 Student FindById(int studId);
}
