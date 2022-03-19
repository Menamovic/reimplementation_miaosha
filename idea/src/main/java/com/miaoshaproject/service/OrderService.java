package com.miaoshaproject.service;

import com.miaoshaproject.service.model.OrderModel;

public interface OrderService {
    OrderModel createOrder(Integer userId, Integer itemId, Integer amount);
}
