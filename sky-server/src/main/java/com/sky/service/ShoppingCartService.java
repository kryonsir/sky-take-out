package com.sky.service;

import com.sky.dto.ShoppingCartDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


public interface ShoppingCartService {

    /**
     *
     * @param shoppingCartDTO
     */
    void addShoppingCart(ShoppingCartDTO shoppingCartDTO);
}
