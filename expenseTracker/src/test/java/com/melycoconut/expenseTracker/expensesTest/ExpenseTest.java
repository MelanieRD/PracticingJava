package com.melycoconut.expenseTracker.expensesTest;
import com.melycoconut.expenseTracker.entities.Expenses;
import com.melycoconut.expenseTracker.entities.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExpenseTest {
    @Test
    public void totalTest(){

        //Parte del setup
        Expenses expenses = new Expenses();

        Product element1 = new Product("Peine", 15.3f);
        Product element2 = new Product("Rizos noc", 30f);
        Product element3 = new Product("Aceite de coco", 150f);

        //ejecucion

        expenses.addProduct(element1);
        expenses.addProduct(element2);
        expenses.addProduct(element3);

        float total = expenses.total();

        assertTrue(total > 0 );
        assertEquals(195.3f, total);


    }


    @Test
    public void invalidTotalTest(){

        //Parte del setup
        Expenses expenses = new Expenses();

        try {
            Float badFloat = Float.parseFloat("banana");

            Product element1 = new Product("Peine", 15.3f);
            Product element2 = new Product(null, badFloat);
            Product element3 = new Product("Aceite de coco", 150f);

            //ejecucion
            expenses.addProduct(element1);
            expenses.addProduct(element2);
            expenses.addProduct(element3);

        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            assertTrue(true);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException("Idk what happened here");
        }

    }
}
