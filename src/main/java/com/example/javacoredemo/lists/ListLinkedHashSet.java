package com.example.javacoredemo.lists;

import java.util.LinkedHashSet;

public class ListLinkedHashSet {

    /**
     *
     * LinkedHashSet is a type of Collection, which takes all the functionalities of HashSet class, that it does not allow
     * duplicate elements to be stored and allow null elements in it. As LinkedHashSet extends HashSet class so it also
     * indirectly extends AbstractSet Class And implements Set Interface. Everything in LinkedHashSet including the basic
     * structure that we get from AbstractSet class, all the methods that are defined in HashSet is extended from its parent class.
     *
     * Important Note:
     * Hash set does not maintains the insertion order, that is when we retrieve values from it we do not get that values in the
     * same order we have entered in it. So, The functionality of maintaining the insertion order is added into LinkedHashSet and
     * to attain this  functionality it uses doubly-linked list. This doubly-linked list maintains the iteration ordering, which
     * is in general the order in which values are added in  the set. Apart from adding this functionality of maintaining insertion
     * order, it do not add any new method of its own.
     *
     *
     * LinkedHashSet Tutorials In Java With Example
     * methods (5)
     * https://abhiandroid.com/java/linkedhashset
     * https://abhiandroid.com/java/linkedhashmap-methods.html
     */

    public void demoLinkedHashSet(){

        //Step 1:

        LinkedHashSet<String> linkedHashSetObject1= new LinkedHashSet<String>();

        LinkedHashSet<Integer> linkedHashSetObject2= new LinkedHashSet<Integer>();

        //Step 2:

        linkedHashSetObject1.add("I");

        linkedHashSetObject1.add("Love");

        linkedHashSetObject1.add("Java");

        linkedHashSetObject1.add("Java");

        linkedHashSetObject1.add("I");

        linkedHashSetObject2.add(9);

        linkedHashSetObject2.add(3);

        linkedHashSetObject2.add(4);

        linkedHashSetObject2.add(9);

        linkedHashSetObject2.add(5);

        linkedHashSetObject2.add(9);

//step 3:
        System.out.println("Values in Linked HashSet String object are:"  +linkedHashSetObject1);

        System.out.println("Values in Linked HashSet Integer object are:"

                +linkedHashSetObject2);

    }
}
