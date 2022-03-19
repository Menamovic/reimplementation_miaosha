package com.miaoshaproject.service.impl;

import com.miaoshaproject.service.OrderService;
import com.miaoshaproject.service.model.OrderModel;
import org.springframework.transaction.annotation.Transactional;

public class OrderServiceImpl implements OrderService {

    @Override
    @Transactional
    public OrderModel createOrder(Integer userId, Integer itemId, Integer amount) {

        // 1.校验下单状态，下单的商品是否存在，用户是否合法，购买数量是否正确


        // 2.落单减库存


        // 3.订单入库


        // 4.
        return null;
    }
}
