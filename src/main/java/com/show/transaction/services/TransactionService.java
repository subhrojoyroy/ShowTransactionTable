package com.show.transaction.services;

import com.show.transaction.entities.Transaction;
import com.show.transaction.exception.TransactionNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class TransactionService {
    abstract public List<Transaction> getAllParentTransactions() throws TransactionNotFoundException;

    abstract public List<Transaction> getChildTransactions(int parentId) throws TransactionNotFoundException;
}