package com.example.stockspring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path="/hi")
public class HelloController {

	@RequestMapping(path="/employeeId/{id}")
	@ResponseBody
	public String sayHello(@PathVariable int id){
		System.out.println("hello");
		return id+": I want to seee this content in the browser";
	}
	
	
	
	
	@RequestMapping(value="/values0")
	public ModelAndView getEmployeeList0(){
		System.out.println("inside abc");
		ModelAndView mv=new ModelAndView(); 
		mv.setViewName("abc");
		mv.addObject("messaage", "welcome to first example of forwarding message");
		mv.addObject("messaage1", "this is message 1");
		
		return mv;
	}
	
	
	@RequestMapping(value="/list")
	public ModelAndView getEmployeeList10(){
		System.out.println("inside abc");
		ModelAndView mv=new ModelAndView(); 
		
		List<Employee> employeeList=new ArrayList<Employee>();
		Employee ramesh=new Employee();
		ramesh.setEmployeeId(1001);
		ramesh.setName("ramesh kumar");

		Employee suresh=new Employee();
		suresh.setEmployeeId(1002);
		suresh.setName("suresh kumar");

		employeeList.add(ramesh);
		employeeList.add(suresh);
		mv.addObject("list",employeeList);
		mv.setViewName("employeeList");
		
		return mv;
	}
	
	
	
	
	
}
