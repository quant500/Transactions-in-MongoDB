package com.meichel.ch.transactionsinmongodb;

import com.meichel.ch.transactionsinmongodb.model.TestEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends MongoRepository<TestEntity, String> {
}