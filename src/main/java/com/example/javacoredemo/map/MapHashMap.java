package com.example.javacoredemo.map;


import java.util.HashMap;
import java.util.Map;

public class MapHashMap {

    /**
     *
     * HashMap is a type of Collection, that stores our data in a pair such that each element has a key associated
     * with it. The pair of key and value is often known as Entry and these entries can have only unique keys.
     *
     * HashMap is a class that implements Map Interface and Extends AbstractMap class which provides the basic
     * structural implementation of Map Interface which minimizes the efforts that are required to implement the
     * Map interface directly in our HashMap Class.
     *
     *
     * Important Note:
     * HashMap allows null key and null value in it, but with a restriction that there can be only one null key and
     * multiple null values.
     *
     * HashMap Tutorial In Java with Example
     * methods (
     * https://abhiandroid.com/java/hashmap
     */

    public void demoHashMap(){

        //Step 1: Defing object of HashMap Class

        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();

        //Step 2: Adding Key Value pair

        hashMap.put(1001,"India");

        hashMap.put(1002,"Canada");

        hashMap.put(1003,"Australia");

        //Step 3: Displaying key value pairs using for loop

        for(Map.Entry map  :  hashMap.entrySet() )
        {

        //Step 4: Using getKey and getValue methods to retrieve key and corresponding value

            System.out.println(map.getKey()+" "+map.getValue());
        }
    };
};
