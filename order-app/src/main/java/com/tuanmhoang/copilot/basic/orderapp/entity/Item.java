package com.tuanmhoang.copilot.basic.orderapp.entity;

// generate entity Item with fields id, name, price
// id is primary key, auto increment
// name is string, not null
// price is double, not null
// use lombok to generate getter, setter, constructor
// use JPA annotations to map id, name, price to database

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "items")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    // fields id, name, price
    private Long id;
    private String name;
    private Double price;

}
