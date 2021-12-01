package br.edu.univas.repository;

import br.edu.univas.configuration.DatabaseConfiguration;
import br.edu.univas.vo.Student;

public class StudentRepository {

	private DatabaseConfiguration databaseConfiguration;

	public StudentRepository() {
		databaseConfiguration = DatabaseConfiguration.getInstance();
	}

	public void insert(Student student) {
		System.out.println("inserting student ");
		System.out.println(student.getName() + " : " + student.getRa());
		System.out.println(" into database: ");
		System.out.println(this.databaseConfiguration.getConfiguration());
	}
}
