package com.show.transaction.services;

import com.show.transaction.entities.Transaction;
import com.show.transaction.exception.TransactionNotFoundException;

import java.util.List;

public abstract class TransactionService {
    abstract public List<Transaction> getAllParentTransactions() throws TransactionNotFoundException;
}