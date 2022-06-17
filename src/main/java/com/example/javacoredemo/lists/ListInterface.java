package com.example.javacoredemo.lists;

import java.util.*;

public class ListInterface {

    /**
     *   List interface is the child interface of Collection interface. It inhibits a list type
     *    data structure in which we can store the ordered collection of objects. It can have duplicate values.
     *    List interface is implemented by the classes:
     *
     *    1) ArrayList,
     *
     *    2) LinkedList, Vector, and Stack.
     *
     */

    List<String> list1= new ArrayList();
    List <String> list2 = new LinkedList();
    List<String> list3 = new Vector();
    List<String> list4 = new Stack();
}
