package com.show.transaction.dao;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.show.transaction.entities.Child;
import com.show.transaction.entities.Data;
import com.show.transaction.exception.TransactionNotFoundException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ChildDao {
    private Gson gson = new Gson();
    List<Child> children = new ArrayList<>();

    public ChildDao() throws TransactionNotFoundException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("resources/Child.json"));
            Data data = gson.fromJson(bufferedReader, Data.class);

            for (Object o : data.getData()) {
                JsonObject jsonObject = (JsonObject) o;
                Child child = new Child();
                child.setId(jsonObject.get("id").getAsInt());
                child.setParentId(jsonObject.get("parentId").getAsInt());
                child.setPaidAmount(jsonObject.get("paidAmount").getAsLong());

                children.add(child);
            }
        } catch (FileNotFoundException e) {
            throw new TransactionNotFoundException("File Not Found");
        }
    }

    public List<Child> getChildren() {
        return children;
    }
}