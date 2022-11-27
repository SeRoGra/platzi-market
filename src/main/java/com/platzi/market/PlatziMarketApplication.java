package com.platzi.market;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.platzi.market.persistence.ProductoRepository;
import com.platzi.market.persistence.crud.IProductoCrudRepository;

@SpringBootApplication
@ComponentScan({ PlatziMarketApplication.MAIN_PACKAGE })
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class PlatziMarketApplication {
	
	public static final String MAIN_PACKAGE = "com.platzi.market";

	public static void main(String[] args) {
		SpringApplication.run(PlatziMarketApplication.class, args);
	}

}
