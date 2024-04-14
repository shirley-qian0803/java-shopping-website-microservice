package com.jiayi.inventoryservice.controller;

import com.jiayi.inventoryservice.dto.InventoryResponse;
import com.jiayi.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    // Request parameters:
    // https://localhost:8082/api/inventory?skuCode=iphone-13&skuCode=iphone-13-red

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    // the RequestParam allows many skuCode to pass in as request
    public List<InventoryResponse> isInStock(@RequestParam List<String> skuCode){
        return inventoryService.isInStock(skuCode);
    }

}
