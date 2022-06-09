package com.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// *******************************************************************
// Ejemplo tomado de https://spring.io/guides/gs/accessing-data-mysql/

@SpringBootApplication
public class DataWithMySqlApplication {

    public static void main(final String[] args) {
        SpringApplication.run(DataWithMySqlApplication.class, args);
    }

}