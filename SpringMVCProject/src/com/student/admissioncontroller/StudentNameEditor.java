package com.student.admissioncontroller;

import java.beans.PropertyEditorSupport;

public class StudentNameEditor extends PropertyEditorSupport {

	/**
	 * when you will submit the admission for --> Spring MVC will run setasText
	 * function of this class-->
	 * 
	 * before performing data binding tast for stuent Name property of student
	 * object
	 */
	@Override
	public void setAsText(String studentName) throws IllegalArgumentException {
		if (studentName.contains("Mr.") || studentName.contains("Ms.")) {
			setValue(studentName);
		} else {
			studentName = "Ms. " + studentName;
			setValue(studentName);

		}
	}

}
