package br.com.infnet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppGuiadeAvesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppGuiadeAvesApplication.class, args);
	}

}
