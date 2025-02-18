package com.shopsphere.service;

import java.util.List;

import com.shopsphere.model.Order;
import com.shopsphere.model.Seller;
import com.shopsphere.model.Transaction;
import com.shopsphere.model.User;

public interface TransactionService {

    Transaction createTransaction(Order order);
    List<Transaction> getTransactionBySeller(Seller seller);
    List<Transaction>getAllTransactions();
}
