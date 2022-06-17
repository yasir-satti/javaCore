package com.example.javacoredemo.lists;

import java.util.ArrayList;
import java.util.Iterator;

public class ListArrayList {

    /**
     *   The ArrayList class implements the List interface. It uses a dynamic array
     *      to store the duplicate element of different data types.
     *
     *      The ArrayList class maintains :
     *
     *      1 ) the insertion order and
     *
     *      2) is non-synchronized
     *
     *      3) The elements stored in the ArrayList class can be randomly accessed.
     *
     *      Java ArrayList Methods (19)
     *
     *      https://abhiandroid.com/java/arraylist-methods-example.html
     */

    public void demoArrayList() {
        ArrayList<String> list = new ArrayList<String>();//Creating arraylist

        list.add("Ravi");//Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");

        //Traversing list through Iterator
        Iterator itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
