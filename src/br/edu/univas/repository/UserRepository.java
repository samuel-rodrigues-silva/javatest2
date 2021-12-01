package br.edu.univas.repository;

import br.edu.univas.configuration.DatabaseConfiguration;
import br.edu.univas.vo.Student;
import br.edu.univas.vo.User;

public class UserRepository {

	private DatabaseConfiguration databaseConfiguration;

	public UserRepository() {
		databaseConfiguration = DatabaseConfiguration.getInstance();
	}

	public void insert(User user) {
		System.out.println("inserting user ");
		System.out.println(user.getName() + " : " + user.getPassword());
		System.out.println(" into database: ");
		System.out.println(this.databaseConfiguration.getConfiguration());
	
	}
}
