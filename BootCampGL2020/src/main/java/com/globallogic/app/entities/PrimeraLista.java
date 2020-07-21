package com.globallogic.app.entities;

import java.util.ArrayList;

public class PrimeraLista {

    public void main() {
        
        ArrayList<String> myList = new ArrayList();

        myList.add(0, "A");
        myList.add(1, "B");
        myList.add(2, "B");

        System.out.println(myList);
        System.out.println(myList.size());

        myList.add(0, "X");
        System.out.println(myList);

        
    }
    
}