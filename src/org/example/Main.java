package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> subjects = Arrays.asList(new String[] {"C","JAVA" , "Python"});
		SubjectService subjectService = new SubjectService(subjects);
		subjectService.showJubjects();
		}
	}


