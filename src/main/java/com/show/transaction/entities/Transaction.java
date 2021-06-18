package com.show.transaction.entities;

public class Transaction {
    int id;
    String sender;
    String receiver;
    long totalAmount;
    long paidAmount;

    public int getId() {
        return id;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public long getTotalAmount() {
        return totalAmount;
    }

    public long getPaidAmount() {
        return paidAmount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void setTotalAmount(long totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setPaidAmount(long paidAmount) {
        this.paidAmount = paidAmount;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Transaction{");
        sb.append("id=").append(id);
        sb.append(", sender='").append(sender).append('\'');
        sb.append(", receiver='").append(receiver).append('\'');
        sb.append(", totalAmount=").append(totalAmount);
        sb.append(", paidAmount=").append(paidAmount);
        sb.append('}');
        return sb.toString();
    }
}