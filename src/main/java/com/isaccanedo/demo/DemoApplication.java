package com.isaccanedo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}

@Controller
class WebController {

	@GetMapping("/")
	public String home() {
		return "index"; // Retorna a página index.html
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/api/hello") // Para manter o endpoint de API
	@ResponseBody
	public String hello() {
		return "Isac Canedo";
	}
}