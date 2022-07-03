package com.example.javacoredemo.anotations;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Yasir Satti
 * <br>
 * <br>Java annotations are metadata (data about data) for our program source code. There are several predefined
 * annotations provided by the Java SE. Moreover, we can also create custom annotations as per our needs.
 *
 * <br>
 * <br>Annotation categories
 *
 * <ul>
 *     <li>
 *         Predefined annotations:
 *         <br>Deprecated / Override / SuppressWarnings / SafeVarargs / FunctionalInterface
 *     </li>
 *     <li>
 *         Custom annotations:
 *         <br>It is also possible to create our own custom annotations.
 *     </li>
 *     <li>
 *         Meta-annotations:
 *         <br>Retention / Documented / Target / Inherited / Repeatable
 *     </li>
 * </ul>
 *
 * @see <a href="https://www.programiz.com/java-programming/annotation-types" target="_blank"> Java Annotation Types</a>
 * <br>
 */
public class AnnotationTypes {

    @SuppressWarnings("deprecated")
    public void demo(){
        // demo dperecated
        deprecatedMethod();

        // demo Override
        Dog dog1 = new Dog();
        dog1.printMessage();

        //demo suppressWarnings
        MainSuppressWarnings depObj = new MainSuppressWarnings();
        depObj.deprecatedMethodSupressWarning();

        // demo safeVarargs
        MainSafeVarargs obj = new MainSafeVarargs();
        List<String> universityList = Arrays.asList("Tribhuvan University", "Kathmandu University");
        obj.displayList(universityList);
        List<String> programmingLanguages = Arrays.asList("Java", "C");
        obj.displayList(universityList, programmingLanguages);

        // demo custom annotation
        MainCustomAnnotation obj2 = new MainCustomAnnotation();
        obj2.method1();


    }

    /**
     * @deprecated
     * This method is deprecated and has been replaced by newMethod()
     */
    @Deprecated
    public static void deprecatedMethod() {
        System.out.println("Deprecated method");
    }

    // 2) Override

    class Animal {

        // overridden method
        public void display(){
            System.out.println("I am an animal");
        }
    }

    class Dog extends Animal {

        // overriding method
        @Override
        public void display(){
            System.out.println("I am a dog");
        }

        public void printMessage(){
            display();
        }
    }

    // 3) SuppressWarnings
    class MainSuppressWarnings {
        @Deprecated
        public void deprecatedMethodSupressWarning() {
            System.out.println("Deprecated method");
        }
    }

    // 4) SafeVarargs

    class MainSafeVarargs {

        @SafeVarargs
        private void displayList(List<String>... lists) {
            for (List<String> list : lists) {
                System.out.println(list);
            }
        }
    }

    // 5) FunctionalInterface

    @FunctionalInterface
    public interface MyFuncInterface{
        public void firstMethod(); // this is an abstract method
        default void secondMethod() {}
        default void thirdMethod() {}
    }

    // 6) Custom annotation

    @interface MyCustomAnnotation {
        String value() default "default value";
    }

    class MainCustomAnnotation {
        @MyCustomAnnotation(value = "programiz")
        public void method1() {
            System.out.println("Test method 1");
        }
    }
}
