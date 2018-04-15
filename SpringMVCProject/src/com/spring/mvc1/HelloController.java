package com.spring.mvc1;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * This is the way with non-annotation based
 * 
 * 
 */
/*import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		
		ModelAndView mView = new ModelAndView("HelloPage");
		mView.addObject("wlcomeMessage", "Hi user, wlecome to the first spring MVC web application");
		return mView;
	}

}*/
/**
 * This is the way with annotation based
 * 
 * 
 */
@Controller
/*@RequestMapping("/greet")*/
public class HelloController {
	
	//@RequestMapping("/welcome")
	@RequestMapping("/welcome/{countryName}/{userName}")   // by putting curly brecketts you can change the hardcord value
	// @pathvariable is bind date of request mapping  , we can add as many as pathvariable annotation but it will be good way
	// to change the way we can use map function in pathvariable annotation. 
	//public ModelAndView helloWorld(@PathVariable("userName") String name) 
	public ModelAndView helloWorld(@PathVariable Map<String, String> pathVars) {
		String name = pathVars.get("userName");
		String country = pathVars.get("countryName");
		
		ModelAndView mView = new ModelAndView("HelloPage");		
		mView.addObject("msg","This is by annotation " + name +" from "+ country);
		return mView;
		
	}
	@RequestMapping("/Hi")
	public ModelAndView hiWorld() {
		ModelAndView mView = new ModelAndView("HelloPage");		
		mView.addObject("msg","This is by annotation for hi annotation");
		return mView;
		
	}
	
	
	
}
