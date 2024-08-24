package com.example.datacontainer.services;

import com.example.datacontainer.models.Item;
import com.example.datacontainer.repositorys.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService{
    private static final Logger logger = LogManager.getLogger(ItemService.class);

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public List<Item> getAllItems() {
        logger.info("Going to get items from DB");
        return itemRepository.findAll();
    }

    @Override
    public Item createItem(Item item) {
        logger.info("Going to save item in DB");
        return itemRepository.save(item);
    }

}
