package com.shopsphere.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopsphere.exception.OrderException;
import com.shopsphere.model.OrderItem;
import com.shopsphere.repository.OrderItemRepository;
import com.shopsphere.service.OrderItemService;

import java.util.Optional;

@Service
public class OrderItemServiceImpl implements OrderItemService {


    private final OrderItemRepository orderItemRepository;

    @Autowired
    public OrderItemServiceImpl(OrderItemRepository orderItemRepository) {
        this.orderItemRepository = orderItemRepository;
    }


    @Override
    public OrderItem getOrderItemById(Long id) throws Exception {

        System.out.println("------- "+id);
        Optional<OrderItem> orderItem = orderItemRepository.findById(id);
        if(orderItem.isPresent()){
            return orderItem.get();
        }
        throw new OrderException("Order item not found");
    }
}
