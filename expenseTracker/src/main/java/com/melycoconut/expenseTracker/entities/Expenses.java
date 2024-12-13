package com.melycoconut.expenseTracker.entities;

import java.util.ArrayList;
import java.util.List;

public class Expenses {

    List<Product> products = new ArrayList<>();

    public void addProduct(Product product){
            this.products.add(product);
    }

    public float total(){
        Float total = 0.0f;

        for(  Product product :  products){
         total +=   product.price;
        }

        return total;
    }

    public List<Product> getProducts(){
        return this.products;
    }


}
