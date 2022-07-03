package com.example.javacoredemo.anotations;

/**
 *
 * @author Yasir Satti
 * <br>
 * <br>Java Meta-annotations are annotations that are applied to other annotations.
 *
 * <br>
 * <br>Meta-annotations
 *
 * <ul>
 *     <li>
 *         Retention:
 *         <br>The <pre>{@code @Retention}</pre> annotation specifies the level up to which the annotation will be
 *         available. Its syntax is:
 *         <pre>{@code @Retention(RetentionPolicy)}</pre>
 *         <br>There are 3 types of retention policies:
 *         <br>1- RetentionPolicy.SOURCE - The annotation is available only at the source level and is ignored by the
 *         compiler.
 *         <br>2- RetentionPolicy.CLASS - The annotation is available to the compiler at compile-time, but is ignored by
 *         the Java Virtual Machine (JVM).
 *         <br>3- RetentionPolicy.RUNTIME - The annotation is available to the JVM.
 *         <br>For example,
 *         <pre>{@code @Retention(RetentionPolicy.RUNTIME)
 *         public @interface MyCustomAnnotation{ }}</pre>
 *
 *     </li>
 *     <li>
 *         Documented:
 *         <br>By default, custom annotations are not included in the official Java documentation. To include our annotation
 *         in the Javadoc documentation, we use the <pre>{@code @Documented}</pre> annotation.
 *         <br>For example,
 *         <pre>{@code @Documented
 *         public @interface MyCustomAnnotation{ }}</pre>
 *     </li>
 *     <li>
 *         Target:
 *         <br>We can restrict an annotation to be applied to specific targets using the <pre>{@code @Target}</pre>
 *         annotation. Its syntax is:
 *         <pre>{@code @Target(ElementType)}</pre>
 *         <br>The ElementType can have one of the following types:
 *         <br>
 *         <table><caption>Element type targets</caption><tbody><tr><th>Element Type</th>
 * 			<th>Target</th>
 * 		</tr><tr><td><code>ElementType.ANNOTATION_TYPE</code></td>
 * 			<td> - Annotation type</td>
 * 		</tr><tr><td><code>ElementType.CONSTRUCTOR </code></td>
 * 			<td> - Constructors</td>
 * 		</tr><tr><td><code>ElementType.FIELD </code></td>
 * 			<td> - Fields</td>
 * 		</tr><tr><td><code>ElementType.LOCAL_VARIABLE </code></td>
 * 			<td> - Local variables</td>
 * 		</tr><tr><td><code>ElementType.METHOD </code></td>
 * 			<td> - Methods</td>
 * 		</tr><tr><td><code>ElementType.PACKAGE </code></td>
 * 			<td> - Package</td>
 * 		</tr><tr><td><code>ElementType.PARAMETER </code></td>
 * 			<td> - Parameter</td>
 * 		</tr><tr><td><code>ElementType.TYPE </code></td>
 * 			<td> - Any element of class</td>
 * 		</tr></tbody></table>
 *
 *     </li>
 *     <li>
 *         Inherited
 *         <br>By default, an annotation type cannot be inherited from a superclass. However, if we need to inherit an
 *         annotation from a superclass to a subclass, we use the <pre>{@code @Inherited}</pre> annotation. Its syntax
 *         is:
 *         <br><pre>{@code @Inherited}</pre>
 *         <br>For example,
 *         <pre>{@code @Inherited
 *         public @interface MyCustomAnnotation {  }}</pre>
 *     <li>
 *         Repeatable
 *         <br>An annotation that has been marked by <pre>{@code @Repeatable}</pre> can be applied multiple times to the
 *         same declaration.
 *         <br><pre>{@code @Repeatable(Universities.class)
 *         public @interface University {
 *         String name();
 *         }}</pre>
 *         <br>The value defined in the <pre>{@code @Repeatable}</pre> annotation is the container annotation. The
 *         container annotation has a variable value of array type of the above repeatable annotation. Here,
 *         Universities are the containing annotation type.
 *         <br><pre>{@code public @interface Universities {
 *          University[] value();
 *          }
 *         }</pre>
 *         <br>Now, the <pre>{@code @University}</pre>annotation can be used multiple times on the same declaration.
 *         <br><pre>{@code @University(name = "TU")
 *         @University(name = "KU")
 *         private String uniName;}</pre>
 *     </li>
 * </ul>
 *
 * @see <a href="https://www.programiz.com/java-programming/annotation-types" target="_blank"> Java Annotation Types</a>
 * <br>
 */
public class MetaAnnotations {

}
