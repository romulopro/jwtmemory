package com.romuloprosp.amigoscode.youtube.security.jwtmemory;

import java.util.ArrayList;

import com.romuloprosp.amigoscode.youtube.security.jwtmemory.Entity.Role;
import com.romuloprosp.amigoscode.youtube.security.jwtmemory.Entity.User;
import com.romuloprosp.amigoscode.youtube.security.jwtmemory.Service.UserService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class JwtmemoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtmemoryApplication.class, args);
	}
	
	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}
	@Bean
	CommandLineRunner run(UserService userService){
		return args-> {
			userService.saveRole(new Role(null, "ROLE_USER"));
			userService.saveRole(new Role(null, "ROLE_MANAGER"));
			userService.saveRole(new Role(null, "ROLE_ADMIN"));
			userService.saveRole(new Role(null, "ROLE_SUPERADMIN"));

			userService.saveUser(new User(null, "Travolta", "john", "1234", new ArrayList<>()));
			userService.saveUser(new User(null, "Sebastiev", "civic", "5678", new ArrayList<>()));
			userService.saveUser(new User(null, "Will", "smith", "9012", new ArrayList<>()));
			userService.saveUser(new User(null, "Arnold", "arnold", "3456", new ArrayList<>()));

			userService.addRoleToUser("john", "ROLE_USER");
			userService.addRoleToUser("civic", "ROLE_MANAGER");
			userService.addRoleToUser("smith", "ROLE_ADMIN");
			userService.addRoleToUser("arnold", "ROLE_SUPERADMIN");
			userService.addRoleToUser("arnold", "ROLE_ADMIN");
			userService.addRoleToUser("arnold", "ROLE_USER");

		};
	}

}
