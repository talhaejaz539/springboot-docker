package com.example.datacontainer.controllers;

import com.example.datacontainer.models.Item;
import com.example.datacontainer.services.ItemService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {
    private static final Logger logger = LogManager.getLogger(ItemController.class);

    @Autowired
    private ItemService itemService;

    @GetMapping(path = "/getAllItems")
    public List<Item> getAllItems() {
        logger.info("Hit Received to get All items");
        return itemService.getAllItems();
    }

    @PostMapping(path = "/addItem")
    public Item createItem(@RequestBody Item item) {
        logger.info("Hit Received to Add a Item");
        return itemService.createItem(item);
    }

}
