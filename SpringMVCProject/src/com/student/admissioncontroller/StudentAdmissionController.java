package com.student.admissioncontroller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.validation.Valid;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		//binder.setDisallowedFields(new String[] { "studentMobile" });
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, "studentDOB", new CustomDateEditor(dateFormat, false));
		binder.registerCustomEditor(String.class, "studentName", new StudentNameEditor());
	}

	@RequestMapping(value = "/admissionForm.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() throws Exception{
		String exceptionIOOccurred = "_IO_EXCEPTION";
		
		String exceptionOccurred = "";//"NULL_POINTER";
		if(exceptionOccurred.equalsIgnoreCase("NULL_POINTER")) {
			throw new NullPointerException("Null Pointer Exception");
		}else if(exceptionIOOccurred.equalsIgnoreCase("IO_EXCEPTION")) {
			throw new IOException("IO Expection");
		}
		ModelAndView model = new ModelAndView("AdmissionForm");
		// model.addObject("headerMessage","Concordia University,Cananda");
		return model;
	}

	/**
	 * 
	 * @param model1
	 */
	@ModelAttribute
	public void addingCommonObject(Model model1) {
		model1.addAttribute("headerMessage", "Concordia University,Cananda");
	}

	/*
	 * public ModelAndView submitAdmissionForm(@RequestParam("studentName") String
	 * name, @RequestParam("studentHobby") String hobby)
	 */
	@RequestMapping(value = "/submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@Valid @ModelAttribute("student1") Student student1,
			BindingResult bindingResult) {
		/**
		 * modelattribute annotation : no need of add object of student nd create
		 * student object it can be used in method as well { when common message in both
		 * get and post or differ modelview ...
		 * 
		 * bindingresult is used to get back old form to handle the incorrect form error
		 */
		if (bindingResult.hasErrors()) {
			ModelAndView model = new ModelAndView("AdmissionForm");
			return model;

		}

		/*
		 * Student student1 = new Student();
		 * 
		 * student1.setStudentName(name); student1.setStudentHobby(hobby);
		 */
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		/*
		 * model.addObject("msg1",
		 * "Details submitted by you :: Name: "+name+", Hobby: "+ hobby);
		 */
		// model.addObject("headerMessage","Concordia University,Cananda");
		/* model.addObject("student1",student1); */
		return model;
	}
	
	@ExceptionHandler(value = NullPointerException.class)
	public String handleNullPointerException(Exception e) {
		
		System.out.println("Null Pointer Exception occuered"+ e);
		
		return "NullPointerException";
	}
	/*@ExceptionHandler(value = IOException.class)
	public String handleIOException(Exception e) {
		
		System.out.println("IO Exception occuered"+ e);
		
		return "IOException";
	}*/
	@ExceptionHandler(value = Exception.class)
	public String handleException(Exception e) {
		
		System.out.println("Unknown Exception occuered"+ e);
		
		return "Exception";
	}

}
