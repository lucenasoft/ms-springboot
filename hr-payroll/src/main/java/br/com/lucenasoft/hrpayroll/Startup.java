package br.com.lucenasoft.hrpayroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
@RibbonClient(name = "hr-worker")
public class Startup {
	// interface com as assinaturas das requisições que você pode fazer

	public static void main(String[] args) {
		SpringApplication.run(Startup.class, args);
	}

}
