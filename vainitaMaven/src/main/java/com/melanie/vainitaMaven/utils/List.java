package com.melanie.vainitaMaven.utils;

import java.util.ArrayList;

public class List<T> extends ArrayList<T> {

    private String owner(){
        return "Esta es la lista de Melanie";
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
