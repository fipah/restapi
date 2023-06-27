package kz.bitlab.springboot.restapi.services;

import kz.bitlab.springboot.restapi.dto.ItemDto;
import kz.bitlab.springboot.restapi.entities.Item;

import java.util.List;

public interface ItemService {
    ItemDto addItem(ItemDto itemDto);
    List<ItemDto> getAllItems();
    ItemDto updateItem(ItemDto updItemDto);
    void deleteItem(Long id);
}
