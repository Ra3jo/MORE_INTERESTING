package com.example.more_interesting.CONTROLLER;

import com.example.more_interesting.ENTITY.Inventory;
import com.example.more_interesting.REPOSITORY.InventoryRepository;
import com.example.more_interesting.SERVICE.InventoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ventory")
public class InventoryController {
    private InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }
    // create
    @PostMapping
    public ResponseEntity<Inventory>createInventory(@RequestBody Inventory inventory){
        return  new ResponseEntity<>(inventoryService.createInventory(inventory), HttpStatus.CREATED);

    }
    // get all
    @GetMapping
    public List<Inventory>getAllInventory(){
        return inventoryService.getAll();

    }
    // get bY id
    @GetMapping("{id}")
    public ResponseEntity<Inventory>getByIdInventory(@PathVariable Long id){
        return  new ResponseEntity<>(inventoryService.getById(id),HttpStatus.OK);
    }
    // update by id
    @PutMapping("{id}")
    public ResponseEntity<Inventory>updateInventory(@PathVariable Long id,@RequestBody Inventory inventory){
        return  new ResponseEntity<>(inventoryService.updateInventory(id,inventory),HttpStatus.OK);
    }
    // delete by id
    @DeleteMapping("{id}")
    public ResponseEntity<String>deleteInventory(@PathVariable Long id){
        inventoryService.deleteInventory(id);
        return new ResponseEntity<>("Deleted Successfully",HttpStatus.OK);
    }
}
