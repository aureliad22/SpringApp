package com.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.springapp.dao.GradeDao;
import com.springapp.dao.StudentDao;
import com.springapp.dao.TeacherDao;
import com.springapp.dao.interfaces.IGradeDao;
import com.springapp.dao.interfaces.IStudentDao;
import com.springapp.dao.interfaces.ITeacherDao;
import com.springapp.manager.GradeManager;
import com.springapp.manager.StudentManager;
import com.springapp.manager.TeacherManager;
import com.springapp.manager.interfaces.IGradeManager;
import com.springapp.manager.interfaces.IStudentManager;
import com.springapp.manager.interfaces.ITeacherManager;
import com.springapp.model.Student;

@SpringBootApplication
public class SpringAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringAppApplication.class, args);
	}

	@Autowired
	private IStudentDao iStudentDao;
	
	@Override
	public void run(String... args) throws Exception {
		Student student = new Student("Toto", "toto22");
		student.setFirstName("Administrator");

		//this.repository.save(user);

	}

	@Bean
	public ITeacherDao getTeacherDao() {
		return new TeacherDao();
	}

	@Bean
	public ITeacherManager getTeacherManager() {
		return new TeacherManager();
	}

	@Bean
	public IStudentDao getStudentDao() {
		return new StudentDao();
	}

	@Bean
	public IStudentManager getStudentManager() {
		return new StudentManager();
	}

	@Bean
	public IGradeDao getGradeDao() {
		return new GradeDao();
	}
	
	@Bean
	public IGradeManager getGradeManager() {
		return new GradeManager();
	}
}
