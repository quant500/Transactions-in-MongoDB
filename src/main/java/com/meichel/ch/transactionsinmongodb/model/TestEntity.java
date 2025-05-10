package com.meichel.ch.transactionsinmongodb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "trades")
public class TestEntity {
    
    @Id
    private String id;
    private String name;
    private String description;
    private int value;
    
    public TestEntity(String name, String description, int value) {
        this.name = name;
        this.description = description;
        this.value = value;
    }
}