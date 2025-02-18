package com.shopsphere.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopsphere.model.Deal;

public interface DealRepository extends JpaRepository<Deal,Long> {

}
