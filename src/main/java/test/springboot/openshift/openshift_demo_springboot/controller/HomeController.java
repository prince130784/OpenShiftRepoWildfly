package test.springboot.openshift.openshift_demo_springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String response(){
		return "Hello Ravinderjeet!! Welcome to your first Cloup App.............";
	}

}
