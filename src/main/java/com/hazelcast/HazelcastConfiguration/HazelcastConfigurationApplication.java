package com.hazelcast.HazelcastConfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@ComponentScan("com.hazelcast.HazelcastConfiguration.*" )
@SpringBootApplication
@EnableJpaRepositories
@EnableCaching
public class HazelcastConfigurationApplication {

	public static void main(String[] args) {


		SpringApplication.run(HazelcastConfigurationApplication.class, args);
	}

}
