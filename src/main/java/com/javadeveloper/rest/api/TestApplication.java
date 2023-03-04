package com.javadeveloper.rest.api;

import com.javadeveloper.rest.api.domain.Role;
import com.javadeveloper.rest.api.domain.User;
import com.javadeveloper.rest.api.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	CommandLineRunner run(UserService userService) {
		return args -> {
			userService.saveRole(new Role(null, "ROLE_USER"));
			userService.saveRole(new Role(null, "ROLE_ADMIN"));

			userService.saveUser(new User(null, "Ari Abdul Majid", "ari", "ari", new ArrayList<>()));
			userService.saveUser(new User(null, "Admin", "admin", "admin", new ArrayList<>()));

			userService.addRoleToUser("ari", "ROLE_USER");
			userService.addRoleToUser("admin", "ROLE_ADMIN");
		};
	}

}
