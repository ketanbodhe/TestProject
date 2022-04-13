package com.example.demo.servicei;

import com.example.demo.model.Student;

public interface StudentServiceI {

	public Student saveData(Student s);

	public Student loginCheck(String un, String ps);

	public Iterable<Student> displayAll();

}
