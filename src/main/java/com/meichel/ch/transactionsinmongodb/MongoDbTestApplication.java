package com.meichel.ch.transactionsinmongodb;

import io.mongock.runner.springboot.EnableMongock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableMongock
public class MongoDbTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongoDbTestApplication.class, args);
    }

}
