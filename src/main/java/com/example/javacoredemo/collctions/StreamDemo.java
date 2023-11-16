package com.example.javacoredemo.collctions;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {
    public static void show() {

        System.out.println("Stream Demo");
        List<Integer> nums = Arrays.asList(4, 1, 5, 12, 6, 23, 7);
        nums.stream().forEach(System.out::println);

        // Data Stream can be used once because it is destroyed after first use
//        Stream<Integer> data = nums.stream();
//         data.forEach(System.out::println);
        // You can use forEach() method to iterate over the elements of the stream ONLY once
        // Exception  java.lang.IllegalStateException: stream has already been operated upon or closed
        // data.forEach(System.out::println);

        // Sort the stream
        System.out.println("Sort Stream data");
        Stream<Integer> data2 = nums.stream();
        Stream<Integer> sortedStream = data2.sorted();
        sortedStream.forEach(System.out::println);

        // Manipulate the stream data
        System.out.println("Mnipulate the stream data by doubling");
        nums.stream()
                .sorted()
                .map(n -> n * 2)
                .forEach(System.out::println);

        // Manipulate the stream data with filter only odd number
        System.out.println("Mnipulate the stream data with filter only odd number");
        nums.stream()
                .filter(n -> n % 2 == 1)
                .sorted()
                .map(n -> n * 2)
                .forEach(System.out::println);

        // Manipulate the stream data with filter only odd number
        System.out.println("Mnipulate the stream data with filter only odd number");
        nums.stream()
                .filter(n -> n % 2 == 1)
                .sorted()
                .map(n -> n * 2)
                .forEach(System.out::println);

        // Manipulate the stream data with reduce, which carryout sum
        System.out.println("Mnipulate the stream data with filter only odd number");
        Optional<Integer> result = nums.stream()
                .filter(n -> n % 2 == 1)
                .sorted()
                .map(n -> n * 2)
                .reduce(Integer::sum);
        System.out.println("Data stream reduce result is " + result.get());
    };
}
