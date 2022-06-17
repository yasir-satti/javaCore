package com.example.javacoredemo.lists;

import java.util.Iterator;
import java.util.LinkedList;

public class ListLinkedList {



    /**
     *  LinkedList implements the Collection interface. It uses a doubly linked list internally
     *      to store the elements:
     *
     *      1) It can store the duplicate elements
     *
     *      2) It maintains the insertion order and
     *
     *      3) is not synchronized.
     *
     *      In LinkedList, the manipulation is fast because no shifting is required.
     *
     *      LinkedList All Methods (22) In Java With Examples
     *
     *      https://abhiandroid.com/java/linkedlist-methods-examples.html
     */

    public void demoLinkedList(){

        LinkedList<String> al=new LinkedList<String>();

        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");

        Iterator<String> itr=al.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}
