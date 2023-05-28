package com.example.more_interesting.REPOSITORY;

import com.example.more_interesting.ENTITY.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory,Long> {
}
