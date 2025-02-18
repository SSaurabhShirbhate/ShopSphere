package com.shopsphere.service;

import java.util.List;
import java.util.Optional;

import com.shopsphere.model.Seller;
import com.shopsphere.model.SellerReport;

public interface SellerReportService {
    SellerReport getSellerReport(Seller seller);
    SellerReport updateSellerReport( SellerReport sellerReport);

}
