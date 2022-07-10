package com.example.javacoredemo.lombok;

/**
 *
 * @author Yasir Satti
 * <br>
 * <br>The project Lombok is a popular and widely used Java library that is used to minimize or remove the boilerplate
 * code. It saves time and effort. Just by using the annotations, we can save space and readability of the source code.
 * It is automatically plugging into IDEs and build tools to spice up your Java application with various annotations.
 * <br>
 * <br><img src="lombok.jpeg" alt="Java Lombok project" width="600" height="400">
 *
 * <br>
 * @see <a href="https://www.javatpoint.com/lombok-java" target="_blank"> Lombok Java project</a>
 * <br>
 * @see <a href="https://www.youtube.com/watch?v=67X5PdWwY6M" target="_blank"> What is Java Project Lombok? ( video )</a>
 * <br>
 */
public class RunLombok {
    LombokUse customer = new LombokUse(
            "Yasir",
            49,
            "Manchester",
            true,
            "06-04-1972"
    );

    public void demo(){
        System.out.println("\nCustomer name is " + customer.getName());
        System.out.println("\nCustomer account status: " + customer.isActive());
        System.out.println("\nCustomer city was " + customer.getCity());
        customer.setCity("London").setAge(50);
        System.out.println("\nCustomer city now is " + customer.getCity());
    }
}
