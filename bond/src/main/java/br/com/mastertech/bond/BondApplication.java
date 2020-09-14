package br.com.mastertech.bond;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BondApplication {

	public static void main(String[] args) {
		SpringApplication.run(BondApplication.class, args);
	}

}