package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.dto.StudentDto;
import com.example.demo.repositry.StudentRepositry;

@Service
public class StudentServiceImpl implements StudentService {
	String msg = null;
	@Autowired
	private StudentRepositry studentRepositry;

	@Override
	public String save(StudentDto dto) {
		Student student = new Student();
		student.setStudName(dto.getStudName());
		student.setCity(dto.getCity());
		student.setCountry(dto.getCountry());
		student.setMobileNo(dto.getMobileNo());
		Student stud = studentRepositry.save(student);
		if (stud == null) {
			msg = "data not saved";
		}
		msg = "data saved";
		return msg;
	}

	@Override
	public Student FindById(int studId) {
		Optional<Student> id = studentRepositry.findById(studId);
		Student stud = id.get();
		return stud;
	}

}
