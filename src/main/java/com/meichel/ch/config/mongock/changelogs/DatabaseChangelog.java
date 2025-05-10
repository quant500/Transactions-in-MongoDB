package com.meichel.ch.config.mongock.changelogs;

import io.mongock.api.annotations.ChangeUnit;
import io.mongock.api.annotations.Execution;
import io.mongock.api.annotations.RollbackExecution;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.mongodb.core.MongoTemplate;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

@Slf4j
@ChangeUnit(id = "initial-setup", order = "001", author = "michael")
public class DatabaseChangelog {

    @Execution
    public void initialSetup(MongoTemplate mongoTemplate) {
        if (!mongoTemplate.collectionExists("items")) {
            mongoTemplate.createCollection("items");
        }

        MongoCollection<Document> collection = mongoTemplate.getCollection("items");
        Document initialDoc = new Document("name", "Item")
                .append("value", 100);
        collection.insertOne(initialDoc);
        log.info("Executed ChangeUnit: initial-setup");
    }

    @RollbackExecution
    public void rollbackInitialSetup(MongoTemplate mongoTemplate) {
        if (mongoTemplate.collectionExists("items")) {
            mongoTemplate.dropCollection("items");
        }
        log.info("Rolled back ChangeUnit: initial-setup");
    }
}