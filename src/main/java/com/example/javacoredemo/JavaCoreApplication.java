package com.example.javacoredemo;

import com.example.javacoredemo.excption.ThrowThrows;
import com.example.javacoredemo.excption.TryCatchFinally;
import com.example.javacoredemo.excption.TryWithResources;
import com.example.javacoredemo.generics.Generics;
import com.example.javacoredemo.iostreams.*;
import com.example.javacoredemo.jdkjrejvm.ClassLoaderDemo;
import com.example.javacoredemo.jdkjrejvm.JITCompilerGraalVM;
import com.example.javacoredemo.lists.*;
import com.example.javacoredemo.logger.SLF4JExample.SLF4JExample;
import com.example.javacoredemo.logger.simpleLogger.SimpleLogger;
import com.example.javacoredemo.lombok.RunLombok;
import com.example.javacoredemo.map.*;
import com.example.javacoredemo.logger.myLoggerFormatter.UseLogger;
import com.example.javacoredemo.oop.abstrct.MountainBike;
import com.example.javacoredemo.oop.abstrct.SportsBike;
import com.example.javacoredemo.oop.encapslation.Person;
import com.example.javacoredemo.oop.intrfc.Rectangle;
import com.example.javacoredemo.oop.intrfc.Square;
import com.example.javacoredemo.oop.plymrphism.Java;
import com.example.javacoredemo.oop.plymrphism.Langauge;
import com.example.javacoredemo.oop.plymrphism.Pattern;
import com.example.javacoredemo.oop.supr.Dog;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class JavaCoreApplication {

    public static void main(String[] args) {

        Scanner mainInput = new Scanner(System.in);
        Scanner subInput = new Scanner(System.in);

        boolean mainLoop = true;
        boolean subLoop = true;


        int mainChoice;
        int subChoice;

        while(true){
            System.out.println("++++++++ Java Core menu +++++++++++++++++");
            System.out.println("1. OOP: Class Abstraction \n");
            System.out.println("2. OOP: Super keyword \n");
            System.out.println("3. OOP: Interface \n");
            System.out.println("4. OOP: Polymorphism using method overriding \n");
            System.out.println("5. OOP: Polymorphism using Method Overloading \n");
            System.out.println("6. OOP: Encapsulation \n");
            System.out.println("7. Lists: Iterable using elements\n");
            System.out.println("8. Lists: ArrayList \n");
            System.out.println("9. Lists: Vector \n");
            System.out.println("10. Lists: Stack \n");
            System.out.println("11. Lists: Priority Queue \n");
            System.out.println("12. Lists: ArrayDeque \n");
            System.out.println("13. Lists: HashSet \n");
            System.out.println("14. Lists: LinkedHashSet \n");
            System.out.println("15. Lists: TreeSet \n");
            System.out.println("16. Map: Interface \n");
            System.out.println("17. Map: HashMap \n");
            System.out.println("18. Map: LinkedHashMap \n");
            System.out.println("19. Map: WeakHashMap \n");
            System.out.println("20. Map: EnumMap \n");
            System.out.println("21. Map: SortedMap Interface \n");
            System.out.println("22. Map: NavigableMap Interface \n");
            System.out.println("23. Map: TreeMap  \n");
            System.out.println("30. IO Streams \n");
            System.out.println("31. Java exceptions handling \n");
            System.out.println("32. Java logging \n");
            System.out.println("33. Lombok \n");
            System.out.println("34. Generics \n");
            System.out.println("50. Class Loader \n");
            System.out.println("51. JIT Compiler \n");
            System.out.println("0. Exit \n");
            System.out.println("\nEnter your menu choice number... ");

            mainChoice = mainInput.nextInt();

            switch(mainChoice){
                case 1:
                    System.out.println(" *******  OOP Abstraction example...");
                    MountainBike mountainBike = new MountainBike();
                    mountainBike.brake();
                    SportsBike sportsBike = new SportsBike();
                    sportsBike.brake();
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.println(" *******  Super keyword...");
                    Dog dog = new Dog();
                    dog.printType();
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.println(" *******  Interface ...");
                    Rectangle rectangle = new Rectangle();
                    rectangle.getArea();
                    rectangle.getSides();
                    Square square = new Square();
                    square.getArea();
                    square.getSides();
                    System.out.println("\n");
                    break;
                case 4:
                    System.out.println(" *******  Polymorphism using method overriding ...");
                    // create an object of Java class
                    Java java = new Java();
                    java.displayInfo();

                    // create an object of Language class
                    Langauge langauge = new Langauge();
                    langauge.displayInfo();
                    System.out.println("\n");
                    break;
                case 5:
                    System.out.println(" *******  Polymorphism using Method Overloading ...");
                    Pattern pattern = new Pattern();

                    // call method without any argument
                    pattern.display();
                    System.out.println("\n");

                    // call method with a single argument
                    pattern.display('#');
                    System.out.println("\n");
                    break;
                case 6:
                    System.out.println(" *******  Encapsulation ...");
                    // create an object of Person
                    Person person = new Person();

                    // change age using setter
                    person.setAge(24);

                    // access age using getter
                    System.out.println("My age is " + person.getAge());
                    System.out.println("\n");
                    break;
                case 7:
                    System.out.println(" *******  Lists Iterator ...");
                    ListIterable listIterable = new ListIterable();
                    listIterable.demoListIterable();
                    System.out.println("\n");
                    break;
                case 8:
                    System.out.println(" *******  ArrayList ...");
                    ListArrayList listArrayList = new ListArrayList();
                    listArrayList.demoArrayList();
                    System.out.println("\n");
                    break;
                case 9:
                    System.out.println(" *******  Vector ...");
                    ListVector listVector = new ListVector();
                    listVector.demoVector();
                    System.out.println("\n");
                    break;
                case 10:
                    System.out.println(" *******  Stack ...");
                    ListStack listStack = new ListStack();
                    listStack.demoStack();
                    System.out.println("\n");
                    break;
                case 11:
                    System.out.println(" *******  Priority Queue ...");
                    ListPriorityQueue listPriorityQueue = new ListPriorityQueue();
                    listPriorityQueue.demoPriorityQueue();
                    System.out.println("\n");
                    break;
                case 12:
                    System.out.println(" *******  ArrayDeque ...");
                    ListArrayDeque listArrayDeque = new ListArrayDeque();
                    listArrayDeque.demoArrayDeque();
                    System.out.println("\n");
                    break;
                case 13:
                    System.out.println(" *******  HashSet ...");
                    ListHashSet listHashSet = new ListHashSet();
                    listHashSet.demoHashSet();
                    System.out.println("\n");
                    break;
                case 14:
                    System.out.println(" *******  LinkedHashSet ...");
                    ListLinkedHashSet listLinkedHashSet = new ListLinkedHashSet();
                    listLinkedHashSet.demoLinkedHashSet();
                    System.out.println("\n");
                    break;
                case 15:
                    System.out.println(" *******  TreeSet ...");
                    ListTreeSet listTreeSet = new ListTreeSet();
                    listTreeSet.demoTreeSet();
                    System.out.println("\n");
                    break;
                case 16:
                    System.out.println(" *******  Interface ...");
                    MapInterface mapInterface = new MapInterface();
                    mapInterface.demoMapInterface();
                    System.out.println("\n");
                    break;
                case 17:
                    System.out.println(" *******  HashMap ...");
                    MapHashMap mapHashMap = new MapHashMap();
                    mapHashMap.demoHashMap();
                    System.out.println("\n");
                    break;
                case 18:
                    System.out.println(" *******  LinkedHashMap ...");
                    MapLinkedHashMap linkedHashMap = new MapLinkedHashMap();
                    linkedHashMap.demo();
                    System.out.println("\n");
                    break;
                case 19:
                    System.out.println(" *******  WeakHashMap ...");
                    MapWeakHashMap weakHashMap = new MapWeakHashMap();
                    weakHashMap.demo();
                    System.out.println("\n");
                    break;
                case 20:
                    System.out.println(" *******  Enum Map ...");
                    MapEnumMap enumMap = new MapEnumMap();
                    enumMap.demo();
                    System.out.println("\n");
                    break;
                case 21:
                    System.out.println(" *******  Sorted Map ...");
                    MapSortedMapInterface sortedMap = new MapSortedMapInterface();
                    sortedMap.demo();
                    System.out.println("\n");
                    break;
                case 22:
                    System.out.println(" *******  NavigableMap Interface ...");
                    MapNavigableMapInterface navigableMapInterface = new MapNavigableMapInterface();
                    navigableMapInterface.demo();
                    System.out.println("\n");
                    break;
                case 23:
                    System.out.println(" *******  TreeMap ...");
                    MapTreeMap treeMap = new MapTreeMap();
                    treeMap.demo();
                    System.out.println("\n");
                    break;
                case 30:
                    while(true) {
                        System.out.println("++++++++ IO Streams menu +++++++++++++++++");
                        System.out.println("1. InputStream & OutputStream \n");
                        System.out.println("2. FileInputStream & FileOutputStream \n");
                        System.out.println("3. ByteArrayInputStream & ByteArrayOutputStream  \n");
                        System.out.println("4. ObjectInputStream & ObjectOutputStream  \n");
                        System.out.println("5. BufferedInputStream & BufferedOutputStream  \n");
                        System.out.println("0. Return to main menu \n");
                        System.out.println("\nEnter your menu choice number... ");

                        subChoice = subInput.nextInt();

                        switch (subChoice) {
                            case 1:
                                System.out.println(" *******  InputStream & OutputStream ...");
                                IOStreams iOinputStream = new IOStreams();
                                iOinputStream.demo();
                                System.out.println("\n");
                                break;
                            case 2:
                                System.out.println(" *******  FileInputStream & FileOutputStream...");
                                IOFileStream ioFileStream = new IOFileStream();
                                ioFileStream.demo();
                                System.out.println("\n");
                                break;
                            case 3:
                                System.out.println(" *******  ByteArrayInputStream & ByteArrayOutputStream...");
                                IOByteArrayStream ioByteArrayStream = new IOByteArrayStream();
                                ioByteArrayStream.demo();
                                System.out.println("\n");
                                break;
                            case 4:
                                System.out.println(" *******  ObjectInputStream & ObjectOutputStream...");
                                IOObjectStream ioObjectStream = new IOObjectStream();
                                ioObjectStream.demo();
                                System.out.println("\n");
                                break;
                            case 5:
                                System.out.println(" *******  BufferedInputStream & BufferedOutputStream...");
                                IOBufferedStream ioBufferedStream = new IOBufferedStream();
                                ioBufferedStream.demo();
                                System.out.println("\n");
                                break;
                            case 0:
                                System.out.println("Go back to main menu...");
                                break;
                            default:
                                System.out.println("This is not a valid menu option! try again");
                                System.out.println("\n");
                                break;
                        }
                    }
                case 31:
                    while(true) {
                        System.out.println("++++++++ Java exceptions handling menu +++++++++++++++++");
                        System.out.println("1. Try-catch-finally block \n");
                        System.out.println("2. Throw and Throws \n");
                        System.out.println("3. Try-with-resources \n");
                        System.out.println("0. Return to main menu \n");
                        System.out.println("\nEnter your menu choice number... ");

                        subChoice = subInput.nextInt();

                        switch (subChoice) {
                            case 1:
                                System.out.println(" *******  Try-catch-finally block ...");
                                TryCatchFinally tryCatchFinally = new TryCatchFinally();
                                tryCatchFinally.demo();
                                System.out.println("\n");
                                break;
                            case 2:
                                System.out.println(" *******  Throw and Throws...");
                                ThrowThrows throwThrows = new ThrowThrows();
                                throwThrows.demo();
                                System.out.println("\n");
                                break;
                            case 3:
                                System.out.println(" *******  Try-with-resources...");
                                TryWithResources tryWithResources = new TryWithResources();
                                tryWithResources.demo();
                                System.out.println("\n");
                                break;
                            case 4:
                                System.out.println(" *******  ObjectInputStream & ObjectOutputStream...");
                                IOObjectStream ioObjectStream = new IOObjectStream();
                                ioObjectStream.demo();
                                System.out.println("\n");
                                break;
                            case 5:
                                System.out.println(" *******  BufferedInputStream & BufferedOutputStream...");
                                IOBufferedStream ioBufferedStream = new IOBufferedStream();
                                ioBufferedStream.demo();
                                System.out.println("\n");
                                break;
                            case 0:
                                System.out.println("Go back to main menu...");
                                break;
                            default:
                                System.out.println("This is not a valid menu option! try again");
                                System.out.println("\n");
                                break;
                        }
                    }
                case 32:
                    while(true) {
                        System.out.println("++++++++ Java Logger menu +++++++++++++++++");
                        System.out.println("1. Logger Fromatter \n");
                        System.out.println("2. Simple Logger \n");
                        System.out.println("3. SLF4j with Logback logging \n");
                        System.out.println("0. Return to main menu \n");
                        System.out.println("\nEnter your menu choice number... ");

                        subChoice = subInput.nextInt();

                        switch (subChoice) {
                            case 1:
                                System.out.println(" *******  Logger Fromatter ...");
                                UseLogger useLogger = new UseLogger();
                                useLogger.demo();
                                System.out.println("\n");
                                break;
                            case 2:
                                System.out.println(" *******  Simple Logger...");
                                SimpleLogger simpleLogger = new SimpleLogger();
                                simpleLogger.demo();
                                System.out.println("\n");
                                break;
                            case 3:
                                System.out.println(" *******  SLF4j with Logback logging...");
                                SLF4JExample slf4JExample = new SLF4JExample();
                                slf4JExample.demo();
                                System.out.println("\n");
                                break;
                            case 4:
                                System.out.println(" *******  ObjectInputStream & ObjectOutputStream...");
                                IOObjectStream ioObjectStream = new IOObjectStream();
                                ioObjectStream.demo();
                                System.out.println("\n");
                                break;
                            case 5:
                                System.out.println(" *******  BufferedInputStream & BufferedOutputStream...");
                                IOBufferedStream ioBufferedStream = new IOBufferedStream();
                                ioBufferedStream.demo();
                                System.out.println("\n");
                                break;
                            case 0:
                                System.out.println("Go back to main menu...");
                                break;
                            default:
                                System.out.println("This is not a valid menu option! try again");
                                System.out.println("\n");
                                break;
                        }
                    }
                case 33:
                    System.out.println(" *******  Java lombok project...");
                    RunLombok runLombok = new RunLombok();
                    runLombok.demo();
                    System.out.println("\n");
                    break;
                case 34:
                    System.out.println(" *******  Java Generics...");
                    Generics generics = new Generics();
                    generics.demoGenerics();
                    System.out.println("\n");
                    break;
                case 50:
                    System.out.println(" *******  Class Loader...");
                    ClassLoaderDemo classLoaderDemo = new ClassLoaderDemo();
                    classLoaderDemo.getDemo();
                    System.out.println("\n");
                    break;
                case 51:
                    System.out.println(" *******  Java core: JIT compiler ...");
                    JITCompilerGraalVM jitCompilerGraalVM = new JITCompilerGraalVM();
                    String text = "po3mrdvfEfvefvVRETrthbBTYrtbrwtbgWErbfvgtwertBRTWRtbrwytntyhWecweFCTYntYN";
                    jitCompilerGraalVM.countUppercase(text);
                    System.out.println("\n");
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("This is not a valid menu option! try again");
                    System.out.println("\n");
                    break;
            }
        }
    }

}
