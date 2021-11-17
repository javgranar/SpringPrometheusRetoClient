package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.controller.ClientController;

@SpringBootApplication
public class SpringActuatorApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringActuatorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		ClientController client = new ClientController();
		
		String status = client.getStatus();
		System.out.println(status);
		
		for(int i=0; i < 5; i++) {
			client.cambio();
			String status2 = client.getStatus();
			System.out.println(status2);
			Thread.sleep(1000);
			if(i >= 3) {
				client.otroCambio();
				Thread.sleep(1000);
				String status3 = client.getStatus();
				System.out.println(status3);
			} else {
				System.out.println(client.getStatus());
				Thread.sleep(1000);
			}
		}
		
	}

}
