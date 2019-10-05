package com.harman.restImage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
"com.harman"
})
public class RestImageApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestImageApplication.class, args);
	}

}
