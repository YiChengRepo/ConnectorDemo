package com.yichang.ConnectorDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConnectorDemoApplication {

	private static final Logger log = LoggerFactory.getLogger(ConnectorDemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ConnectorDemoApplication.class, args);
		RestTemplate restTemplate = new RestTemplate();
		Quote quote = restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
		log.info(quote.toString());
	}
}
