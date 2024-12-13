package com.melycoconut.expenseTracker.entities;

import java.util.Date;

public class Product {
    String name;
    float price;
    Date createdDate;

    public Product( String name, float price){
        if(name == null){
            throw new NullPointerException("name can not be null");
        }

        this.name = name;
        this.price = price;
        this.createdDate = new Date();
    }

    public String getProductName(){
        return this.name;
    }

    public float getProductPrice(){
        return this.price;
    }


}
