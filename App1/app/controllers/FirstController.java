package controllers;

import org.springframework.beans.factory.annotation.Autowired;

import com.samples.sample.service.HelloService;

import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

@org.springframework.stereotype.Controller
public class FirstController extends Controller{

	
	@Autowired
	private HelloService service;
	
	public Result sayHello() {
		
		System.out.println("hey users this is really something ");
		
		return ok(Json.toJson(service.sayHello()));
		
	}
	
}
