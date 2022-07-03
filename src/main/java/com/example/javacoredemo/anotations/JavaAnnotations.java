package com.example.javacoredemo.anotations;

import java.util.ArrayList;

/**
 *
 * @author Yasir Satti
 * <br>
 * <br>Java annotations are metadata (data about data) for our program source code. They provide additional information
 * about the program to the compiler but are not part of the program itself. These annotations do not affect the
 * execution of the compiled program.
 *
 * <br>
 * <br>Annotation formats
 *
 * <ul>
 *     <li>
 *         Marker Annotations:
 *         <br>Marker annotations do not contain members/elements. It is only used for marking a declaration.
 *         <br>example: @Override
 *     </li>
 *     <li>
 *         Single element Annotations:
 *         <br>A single element annotation contains only one element.
 *         <br>example:
 *         \@AnnotationName(value="elementValue")
 *         \@AnnotationName("elementValue")
 *     </li>
 *     <li>
 *         Multiple element Annotations:
 *         <br>These annotations contain multiple elements separated by commas.
 *         <br>example:
 *         /@AnnotationName(element1 = "value1", element2 = "value2")
 *     </li>
 * </ul>
 *
 *
 * <br>
 * <br>Annotation placement
 * <ul>
 *     <li>
 *         Above declarations:
 *         <br>Java annotations can be placed above class, method, interface, field, and other program element declarations
 *     </li>
 * </ul>
 * <br>
 * <br>Type annotations:
 * <br>Type annotations enable Java code to be analyzed better and provide even stronger type checks.
 * Before Java 8, annotations could be applied to declarations only. Now, type annotations can be used as
 * well. This means that we can place annotations wherever we use a type.
 * <ul>
 *         <li>
 *             Constructor invocations
 *             <br>example: <pre>{@code new @Readonly ArrayList<>()}</pre>
 *         </li>
 *         <li>
 *             Type definitions
 *             <br>example:
 *             <br><pre>{@code @NonNull String str;}</pre>
 *             <br><pre>{@code List<@NonNull String> newList;}</pre>
 *         </li>
 *         <li>
 *             Type casts
 *             <br>example: <pre>{@code new Str = (@NonNull String) str;}</pre>
 *         </li>
 *         <li>
 *             extends and implements clause
 *             <br>example:class Warning extends @Localized Message
 *         </li>
 *         <li>
 *             throws clause
 *             <br>example: public String readMethod() throws @Localized IOException
 *         </li>
 *     </ul>
 * <br>
 *
 * <br>Use of Annotations
 * <ul>
 *     <li>
 *         Compiler instructions:
 *         <br>Annotations can be used for giving instructions to the compiler, detect errors or suppress warnings.
 *     </li>
 *     <li>
 *         Compile-time instructions:
 *         <br>Compile-time instructions provided by these annotations help the software build tools to generate code,
 *         XML files and many more.
 *     </li>
 *     <li>
 *         Runtime instructions:
 *         <br>Some annotations can be defined to give instructions to the program at runtime. These annotations are
 *         accessed using Java Reflection.
 *     </li>
 *
 * </ul>
 * @see <a href="https://www.programiz.com/java-programming/annotations" target="_blank"> Java Annotations</a>
 * <br>
 */

public class JavaAnnotations {

    /**
     * Demonstrates use of annotation above element.
     *
     * @since 1.0
     */
    @SuppressWarnings("unchecked")
    static void demoSuppressWarningsAnnotation() {
        ArrayList wordList = new ArrayList<>();

// This causes an unchecked warning
        System.out.println("@SuppressWarnings Annotation Example...");

        wordList.add("programiz");

        System.out.println("Word list => " + wordList);
    }
}

