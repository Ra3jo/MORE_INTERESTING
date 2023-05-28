package com.example.more_interesting;

import com.example.more_interesting.ENTITY.Inventory;
import com.example.more_interesting.REPOSITORY.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoreInterestingApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MoreInterestingApplication.class, args);
    }
    @Autowired
     private InventoryRepository inventoryRepository;
    @Override
    public void run(String... args) throws Exception {
        Inventory inventory=new Inventory();
        inventory.setP_name("RADIO");
        inventory.setLocation("MWANZA");
        inventory.setGmail("www.rbrj@gmail.com");
        inventoryRepository.save(inventory);


    }
}
