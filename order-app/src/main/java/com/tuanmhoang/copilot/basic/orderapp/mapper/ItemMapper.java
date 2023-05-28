package com.tuanmhoang.copilot.basic.orderapp.mapper;

// use mapstruct to map Item to ItemDto and vice versa
// use mapstruct to map List<Item> to List<ItemDto> and vice versa

// import missing packages
import com.tuanmhoang.copilot.basic.orderapp.dto.ItemDto;
import com.tuanmhoang.copilot.basic.orderapp.entity.Item;
import java.util.List;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ItemMapper {

    // map Item to ItemDto
    ItemDto itemToItemDto(Item item);

    // map ItemDto to Item
    Item itemDtoToItem(ItemDto itemDto);

    // map List<Item> to List<ItemDto>
    List<ItemDto> itemsToItemDtos(List<Item> items);

    // map List<ItemDto> to List<Item>
    List<Item> itemDtosToItems(List<ItemDto> itemDtos);

}
