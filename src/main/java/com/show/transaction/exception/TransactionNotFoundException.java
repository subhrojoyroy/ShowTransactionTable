package com.show.transaction.exception;

public class TransactionNotFoundException extends Exception {
    public TransactionNotFoundException() {
        super();
    }

    public TransactionNotFoundException(String message) {
        super(message);
    }

    public TransactionNotFoundException(int parentId) {
        super("Transaction not found for Parent " + parentId);
    }

    public TransactionNotFoundException(Exception e) {
        super(e);
    }
}
