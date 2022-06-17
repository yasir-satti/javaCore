package com.example.javacoredemo.lists;

import java.util.Iterator;
import java.util.Vector;

public class ListVector{

/**
 * Vector uses a dynamic array to store the data elements. It is similar to ArrayList
 * However, It is synchronized and contains many methods that are not the part of Collection framework
 *
 * Vector All Methods (36) In Java With Examples
 *
 * https://abhiandroid.com/java/vector-methods-example.html
 */

public void demoVector(){
    Vector<String> v = new Vector<String>();

    v.add("Ayush");
    v.add("Amit");
    v.add("Ashish");
    v.add("Garima");

    Iterator<String> itr=v.iterator();

    while(itr.hasNext()){
        System.out.println(itr.next());
    }
}


}
