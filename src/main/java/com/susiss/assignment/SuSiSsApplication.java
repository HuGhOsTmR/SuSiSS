package com.susiss.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SuSiSsApplication implements CommandLineRunner {

	@Autowired
	private JdbcTemplate template;
	
	public static void main(String[] args) {
		SpringApplication.run(SuSiSsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		template.execute("DROP TABLE STUDENT IF EXISTS");
		template.execute("CREATE TABLE STUDENT(id INTEGER(11) PRIMARY KEY auto_increment, "
												+ "studentID VARCHAR(24), "
												+ "studentLastName VARCHAR(255), "
												+ "studentFirstName VARCHAR(255))");
		
		template.execute("DROP TABLE CLASS IF EXISTS");
		template.execute("CREATE TABLE CLASS(id INTEGER(11) PRIMARY KEY auto_increment, "
				+ "classCode VARCHAR(24), "
				+ "classTitle VARCHAR(255), "
				+ "classDescription VARCHAR(255))");
		
		template.execute("DROP TABLE ASSIGN IF EXISTS");
		template.execute("CREATE TABLE ASSIGN(id INTEGER(11) PRIMARY KEY auto_increment, "
				+ "classId INTEGER(11), "
				+ "studentId INTEGER(11), "
				+ "assignState VARCHAR(255))");
	}
}
