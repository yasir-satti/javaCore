package com.example.javacoredemo.lists;

import java.util.PriorityQueue;

public class ListPriorityQueue {

    /**
     *
     * A priority queue in Java is a special type of queue wherein all the elements are ordered
     * as per their natural ordering or based on a custom Comparator supplied at the time of creation.
     *
     * The front of the priority queue contains the least element according to the specified ordering,
     * and the rear of the priority queue contains the greatest element.
     *
     * Java PriorityQueue constructoers (6) and methods (12)
     *
     * https://www.programiz.com/java-programming/priorityqueue
     * https://howtodoinjava.com/java/collections/java-priorityqueue/
     * https://www.callicoder.com/java-priority-queue/
     */

    public void demoPriorityQueue(){

        // Creating a priority queue
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        // Using the add() method
        numbers.add(4);
        numbers.add(2);
        System.out.println("PriorityQueue: " + numbers);

        // Using the offer() method
        numbers.offer(1);
        System.out.println("Updated PriorityQueue: " + numbers);
    }
}
