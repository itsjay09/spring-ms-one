package com.ms.one;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MSOneController {

	@GetMapping("/student")
	public Student getMSOneMessage() {
		return new Student(1,"Test name", "jayesh@mail.com");
	}

}
