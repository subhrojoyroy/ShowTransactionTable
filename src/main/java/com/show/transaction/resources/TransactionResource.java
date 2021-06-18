package com.show.transaction.resources;

import com.show.transaction.entities.Transaction;
import com.show.transaction.exception.TransactionNotFoundException;
import com.show.transaction.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.List;

@RestController
@ComponentScan("com.show.transaction.services")
@RequestMapping("/transactions/")
public class TransactionResource {
    @Autowired
    private TransactionService transactionService;

    @GetMapping(value = "allParentTransactions", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity getAllParentTransactions() {
        List<Transaction> responseBody = null;
        try {
            responseBody = transactionService.getAllParentTransactions();
        } catch (TransactionNotFoundException e) {
            System.out.println(e);
            return new ResponseEntity(e.getLocalizedMessage(), HttpStatus.EXPECTATION_FAILED);
        }
        if (responseBody.isEmpty()) {
            return new ResponseEntity(new TransactionNotFoundException("No transaction Found"), HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(responseBody, HttpStatus.OK);
    }

    @GetMapping(value = "getChildTransactions", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity getChildTransactions(@RequestParam("parentId") int parentId) {
        List<Transaction> responseBody = null;
        try {
            responseBody = transactionService.getChildTransactions(parentId);
        } catch (TransactionNotFoundException e) {
            System.out.println(e);
            return new ResponseEntity(e.getLocalizedMessage(), HttpStatus.EXPECTATION_FAILED);
        }
        if (responseBody.isEmpty()) {
            return new ResponseEntity(new TransactionNotFoundException(parentId), HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(responseBody, HttpStatus.OK);
    }
}