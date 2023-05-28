package com.tuanmhoang.copilot.basic.orderapp.repo;

// ItemRepository extends JpaRepository<Item, Long>

import com.tuanmhoang.copilot.basic.orderapp.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
    // CRUD methods
    Optional<Item> findById(Long id);

    Item save(Item item);

    void deleteById(Long id);

    // update method
    void updateItem(Item item);
}
