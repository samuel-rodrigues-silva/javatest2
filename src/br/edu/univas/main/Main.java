package br.edu.univas.main;

import br.edu.univas.repository.StudentRepository;
import br.edu.univas.repository.UserRepository;
import br.edu.univas.vo.Student;
import br.edu.univas.vo.User;

public class Main {
	
	public static void main(String[] args) {
		StudentRepository student = new StudentRepository();
		Student st = new Student();
		st.setName("Samuel Silva");
		st.setRa("não tenho ideia do que seja Ra");
		student.insert(st);
		UserRepository user = new UserRepository();
		User us = new User();
		us.setName("Samuel Silva");
		us.setPassword("Uma senha qualquer");
		user.insert(us);
	}

}
