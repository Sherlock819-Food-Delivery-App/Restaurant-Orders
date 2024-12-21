package com.example.Restaurant_Orders.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderItemDTO {
    private Long orderItemId; // ID of the order item
    private Long itemId; // Store only the menu item ID
    private int quantity; // Quantity of this item ordered
    private Double price; // Price of this item when ordered
    private String name;
}
