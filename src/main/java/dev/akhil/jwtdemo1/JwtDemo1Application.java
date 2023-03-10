package dev.akhil.jwtdemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import dev.akhil.jwtdemo1.config.RsaKeyProperties;

@SpringBootApplication
@EnableConfigurationProperties(RsaKeyProperties.class)
public class JwtDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(JwtDemo1Application.class, args);
	}

}
