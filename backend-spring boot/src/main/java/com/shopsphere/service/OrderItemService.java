package com.shopsphere.service;


import com.shopsphere.exception.OrderException;
import com.shopsphere.model.OrderItem;
import com.shopsphere.model.Product;

public interface OrderItemService {

	OrderItem getOrderItemById(Long id) throws Exception;
	


}
