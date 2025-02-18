package com.shopsphere.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.shopsphere.dto.RevenueChart;
import com.shopsphere.exception.SellerException;
import com.shopsphere.model.Seller;
import com.shopsphere.service.RevenueService;
import com.shopsphere.service.SellerService;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/seller/revenue/chart")
public class RevenueController {
    private final RevenueService revenueService;
    private final SellerService sellerService;

    @GetMapping()
    public ResponseEntity<List<RevenueChart>> getRevenueChart(
            @RequestParam(defaultValue = "today") String type,
            @RequestHeader("Authorization") String jwt) throws SellerException {
        Seller seller = sellerService.getSellerProfile(jwt);
        List<RevenueChart> revenue = revenueService
                .getRevenueChartByType(type, seller.getId());
        return ResponseEntity.ok(revenue);
    }

}
