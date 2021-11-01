package com.example.demo.MyContol;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("show")
	public String getShow() {
		return "show";
	}
	
	@PostMapping("check")
	public String did() {
		return "done";
	}

}
