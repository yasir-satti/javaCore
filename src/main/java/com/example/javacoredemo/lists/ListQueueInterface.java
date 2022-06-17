package com.example.javacoredemo.lists;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ListQueueInterface {

    /**
     * Queue interface maintains the first-in-first-out order. It can be defined as an ordered list
     * that is used to hold the elements which are about to be processed. There are various classes
     * like PriorityQueue, Deque, and ArrayDeque which implements the Queue interface.
     *
     */

    Queue<String> q1 = new PriorityQueue();
    Queue<String> q2 = new ArrayDeque();
}
