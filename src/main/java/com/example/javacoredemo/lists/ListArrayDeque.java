package com.example.javacoredemo.lists;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ListArrayDeque {

    /**
     *
     * The java.util.ArrayDeque class provides resizable-array and implements the Deque interface. Following
     * are the important points about Array Deques −
     *
     * 1) Array deques have no capacity restrictions so they grow as necessary to support usage.
     *
     * 2) They are not thread-safe; in the absence of external synchronization.
     *
     * 3) They do not support concurrent access by multiple threads.
     *
     * 4) Null elements are prohibited in the array deques.
     *
     * 5) They are faster than Stack and LinkedList.
     *
     * This class and its iterator implement all of the optional methods of the Collection and Iterator interfaces
     *
     * constructors (3) methods (31)
     * https://www.tutorialspoint.com/java/util/java_util_arraydeque.htm
     * https://www.geeksforgeeks.org/arraydeque-in-java/
     */

    public void demoArrayDeque(){


                // Creating and initializing deque
                // Declaring object of integer type
                Deque<Integer> de_que = new ArrayDeque<Integer>(10);

                // Operations 1
                // add() method

                // Adding custom elements
                // using add() method to insert
                de_que.add(10);
                de_que.add(20);
                de_que.add(30);
                de_que.add(40);
                de_que.add(50);

                // Iterating using for each loop
                for (Integer element : de_que) {
                    // Print the corresponding element
                    System.out.println("Element : " + element);
                }

                // Operation 2
                // clear() method
                System.out.println("Using clear() ");

                // Clearing all elements using clear() method
                de_que.clear();

                // Operations 3
                // addFirst() method

                // Inserting at the start
                de_que.addFirst(564);
                de_que.addFirst(291);

                // Operation 4
                // addLast() method
                // Inserting at end
                de_que.addLast(24);
                de_que.addLast(14);

                // Display message
                System.out.println(
                        "Above elements are removed now");

                // Iterators

                // Display message
                System.out.println(
                        "Elements of deque using Iterator :");

                for (Iterator itr = de_que.iterator();
                     itr.hasNext();) {
                    System.out.println(itr.next());
                }

                // descendingIterator()
                // To reverse the deque order
                System.out.println(
                        "Elements of deque in reverse order :");

                for (Iterator dItr = de_que.descendingIterator();
                     dItr.hasNext();) {
                    System.out.println(dItr.next());
                }

                // Operation 5
                // element() method : to get Head element
                System.out.println(
                        "\nHead Element using element(): "
                                + de_que.element());

                // Operation 6
                // getFirst() method : to get Head element
                System.out.println("Head Element using getFirst(): "
                        + de_que.getFirst());

                // Operation 7
                // getLast() method : to get last element
                System.out.println("Last Element using getLast(): "
                        + de_que.getLast());

                // Operation 8
                // toArray() method :
                Object[] arr = de_que.toArray();
                System.out.println("\nArray Size : " + arr.length);

                System.out.print("Array elements : ");

                for (int i = 0; i < arr.length; i++)
                    System.out.print(" " + arr[i]);

                // Operation 9
                // peek() method : to get head
                System.out.println("\nHead element : "
                        + de_que.peek());

                // Operation 10
                // poll() method : to get head
                System.out.println("Head element poll : "
                        + de_que.poll());

                // Operation 11
                // push() method
                de_que.push(265);
                de_que.push(984);
                de_que.push(2365);

                // Operation 12
                // remove() method : to get head
                System.out.println("Head element remove : "
                        + de_que.remove());

                System.out.println("The final array is: " + de_que);
            }
        }
