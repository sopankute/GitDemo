package com.gitexample.gitdemo;

import com.gitexample.gitdemo.util.GitDemoProgram;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitDemoApplication.class, args);

		GitDemoProgram gitDemoProgram = new GitDemoProgram();
		gitDemoProgram.print();

		System.out.println("GitDemoApplication.main | Responsible for Initializing Spring Boot Application");
	}

}
