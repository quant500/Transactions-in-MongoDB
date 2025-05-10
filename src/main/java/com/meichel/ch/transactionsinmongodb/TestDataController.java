package com.meichel.ch.transactionsinmongodb;

import com.meichel.ch.transactionsinmongodb.service.ItemService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/item")

public class TestDataController {

    private final ItemService itemService;

    public TestDataController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping
    public void createItem() {
        itemService.insertItem();
    }
}
