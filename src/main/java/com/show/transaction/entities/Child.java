package com.show.transaction.entities;

public class Child {
    int id;
    int parentId;
    long paidAmount;

    public int getId() {
        return id;
    }

    public int getParentId() {
        return parentId;
    }

    public long getPaidAmount() {
        return paidAmount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public void setPaidAmount(long paidAmount) {
        this.paidAmount = paidAmount;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Child{");
        sb.append("id=").append(id);
        sb.append(", parentId=").append(parentId);
        sb.append(", paidAmount=").append(paidAmount);
        sb.append('}');
        return sb.toString();
    }
}
