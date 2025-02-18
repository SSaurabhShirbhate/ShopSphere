package com.shopsphere.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopsphere.model.HomeCategory;

public interface HomeCategoryRepository extends JpaRepository<HomeCategory,Long> {
}
