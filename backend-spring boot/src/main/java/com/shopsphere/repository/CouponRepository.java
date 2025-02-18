package com.shopsphere.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopsphere.model.Coupon;

public interface CouponRepository extends JpaRepository<Coupon,Long> {
    Coupon findByCode(String couponCode);
}
