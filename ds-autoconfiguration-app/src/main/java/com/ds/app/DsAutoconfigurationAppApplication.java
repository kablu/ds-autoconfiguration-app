package com.ds.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;



@SpringBootApplication
public class DsAutoconfigurationAppApplication implements CommandLineRunner {

	 @Autowired
	    private JdbcTemplate jdbcTemplate;

	    public static void main(String[] args) {
	        SpringApplication.run(DsAutoconfigurationAppApplication.class, args);
	    }

	    @Override
	    public void run(String... args) {
	        System.out.println("Fetching employees e-mails");
	        jdbcTemplate.queryForList("select email from employee", String.class)
	                .forEach(System.out::println);
	    }

}
