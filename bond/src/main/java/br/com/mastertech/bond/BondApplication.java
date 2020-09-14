package br.com.mastertech.bond;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDiscoveryClient
public class BondApplication {

	public static void main(String[] args) {
		SpringApplication.run(BondApplication.class, args);
	}

}