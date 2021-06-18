package com.show.transaction.dao;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.show.transaction.entities.Data;
import com.show.transaction.entities.Parent;
import com.show.transaction.exception.TransactionNotFoundException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ParentDao {
    private Gson gson = new Gson();
    List<Parent> parents = new ArrayList<>();

    public ParentDao() throws TransactionNotFoundException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("resources/Parent.json"));
            Data data = gson.fromJson(bufferedReader, Data.class);

            for (Object o : data.getData()) {
                JsonObject jsonObject = (JsonObject) o;
                Parent parent = new Parent();
                parent.setId(jsonObject.get("id").getAsInt());
                parent.setSender(jsonObject.get("sender").getAsString());
                parent.setReceiver(jsonObject.get("receiver").getAsString());
                parent.setTotalAmount(jsonObject.get("totalAmount").getAsLong());

                parents.add(parent);
            }
        } catch (FileNotFoundException e) {
            throw new TransactionNotFoundException("File Not Found");
        }
    }

    public List<Parent> getParents() {
        return parents;
    }
}