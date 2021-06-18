package com.show.transaction.resources;

import com.show.transaction.entities.Transaction;
import com.show.transaction.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/transactions/")
public class TransactionResource {
    @Autowired
    private TransactionService transactionService;

    @GetMapping(value = "allParentTransactions", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity getAllParentTransactions() {
        //List<Transaction> responseBody = transactionService.getAllParentTransactions();
        return null;
    }
}