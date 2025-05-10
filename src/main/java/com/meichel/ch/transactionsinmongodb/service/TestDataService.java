package com.meichel.ch.transactionsinmongodb.service;

import com.meichel.ch.transactionsinmongodb.TestRepository;
import com.meichel.ch.transactionsinmongodb.model.TestEntity;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestDataService {

    private final TestRepository testRepository;

    @Autowired
    public TestDataService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @PostConstruct
    public void insertTestData() {
        testRepository.deleteAll();
        
        List<TestEntity> testEntities = List.of(
            new TestEntity("Trade 1", "Beschreibung für Trade 1", 100),
            new TestEntity("Trade 2", "Beschreibung für Trade 2", 200),
            new TestEntity("Trade 3", "Beschreibung für Trade 3", 300),
            new TestEntity("Trade 4", "Beschreibung für Trade 4", 400),
            new TestEntity("Trade 5", "Beschreibung für Trade 5", 500)
        );
        testRepository.saveAll(testEntities);
    }
}