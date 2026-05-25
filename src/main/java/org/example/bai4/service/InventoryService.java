package org.example.bai4.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class InventoryService {

    public void updateStock(String productId, int qty) {
        log.info("Bat dau cap nhat kho cho SP: {}, SL: {}", productId, qty);
    }
}