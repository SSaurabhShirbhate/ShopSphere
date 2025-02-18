package com.shopsphere.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopsphere.domain.PayoutsStatus;
import com.shopsphere.model.Payouts;

import java.util.List;

public interface PayoutsRepository extends JpaRepository<Payouts,Long> {

    List<Payouts> findPayoutsBySellerId(Long sellerId);
    List<Payouts> findAllByStatus(PayoutsStatus status);
}
