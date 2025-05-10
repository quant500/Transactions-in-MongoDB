package com.meichel.ch.transactionsinmongodb.service;

import com.meichel.ch.transactionsinmongodb.ItemRepository;
import com.meichel.ch.transactionsinmongodb.model.TestEntity;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public void insertItem() {
        itemRepository.deleteAll();
        
        List<TestEntity> itemEntities = List.of(
            new TestEntity("Trade 1", "Description for Item 1", 100),
            new TestEntity("Trade 2", "Description for Item 2", 200),
            new TestEntity("Trade 3", "Description for Item 3", 300),
            new TestEntity("Trade 4", "Description for Item 4", 400),
            new TestEntity("Trade 5", "Description for Item 5", 500)
        );
        itemRepository.saveAll(itemEntities);
    }
}