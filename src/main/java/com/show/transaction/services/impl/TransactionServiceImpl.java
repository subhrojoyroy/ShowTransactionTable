package com.show.transaction.services.impl;

import com.show.transaction.dao.ChildDao;
import com.show.transaction.dao.ParentDao;
import com.show.transaction.entities.Child;
import com.show.transaction.entities.Parent;
import com.show.transaction.entities.Transaction;
import com.show.transaction.exception.TransactionNotFoundException;
import com.show.transaction.services.TransactionService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class TransactionServiceImpl extends TransactionService {
    @Override
    public List<Transaction> getAllParentTransactions() throws TransactionNotFoundException {
        List<Transaction> transactions = new ArrayList<>();
        try {
            List<Child> children = new ChildDao().getChildren();
            List<Parent> parents = new ParentDao().getParents();
            Map<Parent, Long> paymentsDone = new HashMap<>();
            for (Child c : children) {
                Parent parent = new Parent();
                parent.setId(c.getParentId());
                long amount = paymentsDone.get(parent) == null ? c.getPaidAmount() : paymentsDone.get(parent) + c.getPaidAmount();
                paymentsDone.put(parent, amount);
            }
            for (Parent p : parents) {
                Transaction transaction = new Transaction();
                transaction.setId(p.getId());
                transaction.setPaidAmount(paymentsDone.getOrDefault(p, 0l));
                transaction.setReceiver(p.getReceiver());
                transaction.setSender(p.getSender());
                transaction.setTotalAmount(p.getTotalAmount());

                transactions.add(transaction);
            }
        } catch (TransactionNotFoundException e) {
            throw new TransactionNotFoundException(e);
        }

        return transactions;
    }
}