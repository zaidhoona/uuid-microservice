package com.hoona.zaid.uuidms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;

import javax.sql.DataSource;

@SpringBootApplication
public class UuidMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(UuidMsApplication.class, args);
    }
}
