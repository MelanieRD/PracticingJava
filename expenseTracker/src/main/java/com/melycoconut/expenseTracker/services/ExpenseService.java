package com.melycoconut.expenseTracker.services;
import com.melycoconut.expenseTracker.entities.Expenses;
import com.melycoconut.expenseTracker.entities.Product;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ExpenseService {

   private Expenses expenses = new Expenses();


    public void getProductsService(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Write the expense: ");
        String expense = scan.nextLine(); // Formato: xxxx, $.$

        List<String> tuple =  Arrays.stream(expense.split(",")).toList();
        String productName = tuple.get(0);
        Float price =  Float.parseFloat(tuple.get(1)) ;

        Product newProduct = new Product(productName, price);
        expenses.addProduct(newProduct);

        System.out.println("Do you want to add any other product? Yes|No");
        String response = scan.nextLine();

        if(response.equals("Yes") || response.equals("yes") ){
           getProductsService();
        } else {
            printProducts(expenses.getProducts());
            System.out.println("The product total equals to: "+expenses.total());
        }


    }

    public void printProducts(List<Product> Products ){
        int count = 1;
        for(Product product: Products){
            System.out.println(count+". "+product.getProductName()+" = "+product.getProductPrice());
            count++;
        }
    }



}
