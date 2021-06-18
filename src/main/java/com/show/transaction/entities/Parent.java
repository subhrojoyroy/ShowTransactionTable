package com.show.transaction.entities;

import java.util.Objects;

public class Parent {
    int id;
    String sender;
    String receiver;
    long totalAmount;

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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Parent{");
        sb.append("id=").append(id);
        sb.append(", sender='").append(sender).append('\'');
        sb.append(", receiver='").append(receiver).append('\'');
        sb.append(", totalAmount=").append(totalAmount);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parent parent = (Parent) o;
        return id == parent.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}