package com.student.admissioncontroller;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;

import org.springframework.messaging.handler.annotation.Payload;

@Documented
@Constraint(validatedBy = HobbyValidator.class)
@Retention(RUNTIME)
@Target(FIELD)
public @interface IsValidHobby {
	
	String listOfHobbies() default "Music|Football|Batminton|Hockey";
	
	String message()  default "Please provide a vaid Hobby:"+ 
	    "accepted Hobbies are -Music,Football,Batminton,Hockey(Choose Anyone)";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};

}
