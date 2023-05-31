package cl.musicpro.svc_service_product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SvcServiceProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(SvcServiceProductApplication.class, args);
	}

}
