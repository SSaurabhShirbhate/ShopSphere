package com.shopsphere.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.shopsphere.exception.SellerException;
import com.shopsphere.model.Order;
import com.shopsphere.model.Seller;
import com.shopsphere.model.Transaction;
import com.shopsphere.service.SellerService;
import com.shopsphere.service.TransactionService;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    private final TransactionService transactionService;
    private final SellerService sellerService;

    @Autowired
    public TransactionController(TransactionService transactionService, SellerService sellerService) {
        this.transactionService = transactionService;
        this.sellerService = sellerService;
    }

    @PostMapping
    public ResponseEntity<Transaction> createTransaction(@RequestBody Order order) {
        Transaction transaction = transactionService.createTransaction(order);
        return ResponseEntity.ok(transaction);
    }

    @GetMapping("/seller")
    public ResponseEntity<List<Transaction>> getTransactionBySeller(
            @RequestHeader("Authorization") String jwt) throws SellerException {
        Seller seller=sellerService.getSellerProfile(jwt);

        List<Transaction> transactions = transactionService.getTransactionBySeller(seller);
        return ResponseEntity.ok(transactions);
    }

    @GetMapping
    public ResponseEntity<List<Transaction>> getAllTransactions() {
        List<Transaction> transactions = transactionService.getAllTransactions();
        return ResponseEntity.ok(transactions);
    }
}
