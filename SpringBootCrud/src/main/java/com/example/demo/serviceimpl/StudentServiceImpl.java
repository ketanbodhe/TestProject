package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.servicei.StudentServiceI;
@Service
public class StudentServiceImpl implements StudentServiceI{
	@Autowired
	StudentRepository sr;

	@Override
	public Student saveData(Student s) {
		// TODO Auto-generated method stub
		return sr.save(s);
	}

	@Override
	public Student loginCheck(String un, String ps) {
		// TODO Auto-generated method stub
		return sr.findByUnameAndPassword(un, ps);
	}

	@Override
	public Iterable<Student> displayAll() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}

}
