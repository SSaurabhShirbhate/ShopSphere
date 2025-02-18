package com.shopsphere.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.shopsphere.exception.CartItemException;
import com.shopsphere.exception.UserException;
import com.shopsphere.model.CartItem;
import com.shopsphere.model.User;
import com.shopsphere.response.ApiResponse;
import com.shopsphere.service.CartItemService;
import com.shopsphere.service.UserService;

@RestController
@RequestMapping("/api/cart_items")
public class CartItemController {

	private CartItemService cartItemService;
	private UserService userService;
	
	public CartItemController(CartItemService cartItemService, UserService userService) {
		this.cartItemService=cartItemService;
		this.userService=userService;
	}
	

}
