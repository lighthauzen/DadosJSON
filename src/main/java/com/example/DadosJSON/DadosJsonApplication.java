package com.example.DadosJSON;

import com.example.DadosJSON.domain.Base;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;

@SpringBootApplication
public class DadosJsonApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DadosJsonApplication.class, args);
	}

	@Override
	public void run(String[] args) throws IOException {

//		//create ObjectMapper instance
//		ObjectMapper objectMapper = new ObjectMapper();
//
//		File arquivo = new File("src/main/resources/json/data_teste.json");
//		System.out.println(arquivo.getName());

		//read json file and convert to customer object
//		Base base = objectMapper.readValue(arquivo, Base.class);
//		if (base.getData()[0].toString().equals(base.getData()[1].toString())) {
//			System.out.println("verdadeiro");
//		} else {
//			System.out.println("falso");
//		}


//		System.out.println(base.getData()[0]);
//		System.out.println(base.getData()[1]);
//		//print customer details
//		System.out.println(base.getData()[3].toString());
	}

}
