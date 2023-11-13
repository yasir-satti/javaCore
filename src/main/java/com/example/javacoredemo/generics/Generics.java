package com.example.javacoredemo.generics;

import com.example.javacoredemo.generics.classes.Animal;
import com.example.javacoredemo.generics.classes.AnimalPrinter;
import com.example.javacoredemo.generics.classes.Cat;
import com.example.javacoredemo.generics.classes.Dog;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yasir Satti
 * <br>
 * <br>Generics means parameterized types. The idea is to allow type (Integer, String, … etc., and user-defined types)
 * to be a parameter to methods, classes, and interfaces. Using Generics, it is possible to create classes that work
 * with different data types. An entity such as class, interface, or method that operates on a parameterized type is a
 * generic entity.
 *
 * <br>Why Generics?
 * The Object is the superclass of all other classes, and Object reference can refer to any object. These features lack
 * type safety. Generics add that type of safety feature.
 *
 * <br>A. Types of Java Generics
 * <br>
 * <br>1 - Generic Method:
 * Generic Java method takes a parameter and returns some value after performing a task. It is exactly like a normal
 * function, however, a generic method has type parameters that are cited by actual type. This allows the generic method
 * to be used in a more general way. The compiler takes care of the type of safety which enables programmers to code
 * easily since they do not have to perform long, individual type castings.
 *
 * <br>
 * <br>2 - Generic Classes:
 * A generic class is implemented exactly like a non-generic class. The only difference is that it contains a type
 * parameter section. There can be more than one type of parameter, separated by a comma. The classes, which accept one
 * or more parameters, ?are known as parameterized classes or parameterized types.
 *
 * <br>B. Bounded Generics
 * Bounded means “restricted,” and we can restrict the types that a method accepts.
 * For example, we can specify that a method accepts a type and all its subclasses (upper bound) or a type and all its
 * superclasses (lower bound).
 *
 * <br>C. Multiple Bounded Generics
 * Java Generics supports multiple bounds also, i.e., In this case, A can be an interface or class. If A is class, then
 * B and C should be interfaces. We can’t have more than one class in multiple bounds.
 *
 * <br>D. Using Wildcards With Generics
 * Wildcards are represented by the question mark ? in Java, and we use them to refer to an unknown type. Wildcards are
 * particularly useful with generics and can be used as a parameter type.
 *
 * But first, there is an important note to consider. We know that Object is the supertype of all Java classes. However,
 * a collection of Object is not the supertype of any collection.
 *
 * <br>E. Type Erasure
 * Generics were added to Java to ensure type safety. And to ensure that generics won’t cause overhead at runtime, the
 * compiler applies a process called type erasure on generics at compile time.
 *
 * Type erasure removes all type parameters and replaces them with their bounds or with Object if the type parameter is
 * unbounded. This way, the bytecode after compilation contains only normal classes, interfaces and methods, ensuring
 * that no new types are produced. Proper casting is applied as well to the Object type at compile time.
 *
 * <br>
 * @see <a href="https://www.baeldung.com/java-generics" target="_blank"> The Basics of Java Generics</a>
 * <br>
 * <br>
 * @see <a href="https://www.geeksforgeeks.org/generics-in-java/" target="_blank"> Generics in Java</a>
 * <br>
 *  @see <a href="https://www.geeksforgeeks.org/bounded-types-generics-java/" target="_blank"> Bounded Types with Generics in Java</a>
 *  <br>
 * <br>
 */
public class Generics {

    public void demoGenerics() {

        // General example
        System.out.println("1 - Generics general example");
        Printer<Integer> printer = new Printer<>(10);
        printer.print();
        Printer<String> printer2 = new Printer<>("Hello");
        printer2.print();
        Printer<Double> printer3 = new Printer<>(12.3);
        printer3.print();

        System.out.println("\n");

        // Upper Bounded-types
        // Class AnimalPrinter is upper bounded with <T extends Animal>
        System.out.println("2 - Generics upper bound example");
        Cat myCat = new Cat("Jade", 2);
        Dog myDog = new Dog("Hutch", 5, 4.5);
        AnimalPrinter<Cat> catAnimalPrinter = new AnimalPrinter<>(myCat);
        catAnimalPrinter.print();
        AnimalPrinter<Dog> dogAnimalPrinter = new AnimalPrinter<>(myDog);
        dogAnimalPrinter.print();

        System.out.println("\n");

        // Generic methods
        System.out.println("3 - Generic methods example");
        String somethingElse1 = shoutSomething(45, "cows");
        Double somethingElse2 = shoutSomething("Hello", 65.6);
        Integer somethingElse3 = shoutSomething(12.3, 12);
        System.out.println(somethingElse1);
        System.out.println(somethingElse2);
        System.out.println(somethingElse3);

        // Wildcards generics
        // method printList(List<?> inList) can accept any type of objects passed in the list
        System.out.println("4 - Generic wildcards example");
        List<Integer> inList = new ArrayList<>();
        inList.add(1);
        inList.add(2);
        printList(inList);
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        printList(stringList);

        // method printCatList(List<?> inList) is upper bound with class Animal of objects passed in the list
        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat("Jade", 2));
        catList.add(new Cat("Polly", 5));
        printCatList(catList);
    }

    private void printCatList(List<? extends Animal> catList) {
        System.out.println(catList);
    }

    private void printList(List<?> inList) {
        System.out.println(inList);
    }

    private <T, V> V shoutSomething(T something, V somethingElse) {
        System.out.println(something + "!!!");
        System.out.println(somethingElse + "***");
        return somethingElse;
    };
};
