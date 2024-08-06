package com.example.datacontainer.controllers;

import com.example.datacontainer.models.Item;
import com.example.datacontainer.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping(path = "/getAllItems")
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }

    @PostMapping(path = "/addItem")
    public Item createItem(@RequestBody Item item) {
        return itemService.createItem(item);
    }

}
