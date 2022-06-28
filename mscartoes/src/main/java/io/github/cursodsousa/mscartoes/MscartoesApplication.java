package io.github.cursodsousa.mscartoes;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableRabbit
@Slf4j
public class MscartoesApplication {

	public static void main(String[] args) {
		log.info("Informação: {}", "Teste info");
		log.error("Erro: {}", "Teste erro");
		log.warn("Aviso: {}", "Teste warn");
		SpringApplication.run(MscartoesApplication.class, args);
	}

}
