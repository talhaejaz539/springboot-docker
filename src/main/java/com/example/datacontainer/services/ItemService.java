package com.example.datacontainer.services;

import com.example.datacontainer.models.Item;

import java.util.List;

public interface ItemService {

    List<Item> getAllItems();
    Item createItem(Item item);

}
