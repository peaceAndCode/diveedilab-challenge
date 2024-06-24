package com.diveedilab.petchallenge;

import jakarta.persistence.Cacheable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class PetChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetChallengeApplication.class, args);
	}

}
