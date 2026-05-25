package org.example.bai4.controller;

import org.example.bai4.service.InventoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    private final InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @PostMapping("/update")
    public ResponseEntity<String> updateStock(@RequestParam String productId, @RequestParam int qty) {
        inventoryService.updateStock(productId, qty);
        return ResponseEntity.ok("Đã xử lý xong");
    }
}

