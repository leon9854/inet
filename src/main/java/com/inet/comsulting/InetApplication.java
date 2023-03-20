package com.inet.comsulting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.inet.comsulting.model.Product;
import com.inet.comsulting.service.ServiceInet;

@SpringBootApplication
public class InetApplication {
	

	public static void main(String[] args)  {
		SpringApplication.run(InetApplication.class, args);
		
	}

}
