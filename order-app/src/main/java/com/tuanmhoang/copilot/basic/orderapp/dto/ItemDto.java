package com.tuanmhoang.copilot.basic.orderapp.dto;


// use lombok to generate getter, setter, constructor

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemDto {
    // fields id, name, price
    private Long id;
    private String name;
    private Double price;
}
