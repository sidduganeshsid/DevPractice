package com.sag.a1SpBt_SimpleRestApi;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> retriveAllCourses(){
		return Arrays.asList(
				new Course(1,"java","sidduganesh"),
				new Course(2,"python","priya"),
				new Course(3,"web development","sidduganesh")
				);
	}

}
