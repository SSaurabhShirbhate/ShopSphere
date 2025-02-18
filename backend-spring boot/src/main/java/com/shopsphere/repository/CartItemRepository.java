package com.shopsphere.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopsphere.model.Cart;
import com.shopsphere.model.CartItem;
import com.shopsphere.model.Product;
import com.shopsphere.model.User;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


    CartItem findByCartAndProductAndSize(Cart cart, Product product, String size);


}
