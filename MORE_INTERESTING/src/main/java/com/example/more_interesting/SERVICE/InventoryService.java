package com.example.more_interesting.SERVICE;

import com.example.more_interesting.ENTITY.Inventory;

import java.util.List;

public interface InventoryService {
    // create
    Inventory createInventory(Inventory inventory);
    // get all
    List<Inventory>getAll();
    // get by id
    Inventory getById(Long id);
    // update
    Inventory updateInventory(Long id,Inventory inventory);
    void deleteInventory(Long id);
}
