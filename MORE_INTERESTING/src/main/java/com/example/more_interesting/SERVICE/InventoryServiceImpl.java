package com.example.more_interesting.SERVICE;

import com.example.more_interesting.ENTITY.Inventory;
import com.example.more_interesting.EXCEPTION.ResourceNotFoundException;
import com.example.more_interesting.REPOSITORY.InventoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InventoryServiceImpl implements InventoryService{
    private InventoryRepository inventoryRepository;

    public InventoryServiceImpl(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }
   //create
    @Override
    public Inventory createInventory(Inventory inventory) {
        return inventoryRepository.save(inventory);
    }
  // get all InventoryService
    @Override
    public List<Inventory> getAll() {
        return inventoryRepository.findAll();
    }
// get by id
    @Override
    public Inventory getById(Long id) {
        Inventory  inventory=inventoryRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("NotFound"));
        return inventory;
    }
// update Inventory service
    @Override
    public Inventory updateInventory(Long id, Inventory inventory) {
        Inventory existingInventory=inventoryRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("NotFound"));
        existingInventory.setP_name(inventory.getP_name());
        existingInventory.setLocation(inventory.getLocation());
        existingInventory.setGmail(inventory.getGmail());
        Inventory upadateInventory=inventoryRepository.save(inventory);
        return upadateInventory;
    }

    @Override
    public void deleteInventory(Long id) {
        Inventory deleteInventory=inventoryRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("NotFound"));
        inventoryRepository.delete(deleteInventory);
    }
}
