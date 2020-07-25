package com.albertsons.epe;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WobController {

	@GetMapping("/greeting")
	public String greeting() {
		return "Hi Ram!!!";
	}
}
