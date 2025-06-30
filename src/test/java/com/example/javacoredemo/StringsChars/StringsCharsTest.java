package com.example.javacoredemo.StringsChars;

import com.example.javacoredemo.stringsChar.StringsChars;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


public class StringsCharsTest {

  @Test
  @DisplayName("charAt - Get Char at given index")
  void getcharAtIndex() {
    String text = "This is test!";
    StringsChars stringChar = new StringsChars();
    char charValue = stringChar.getChar(text, 2);
    assertEquals('i', charValue);
  }

  @Test
  @DisplayName("codePointAt - Returns the Unicode of the character at specified index")
  void getUnicodeOfcharAtIndex() {
    String text = "This is test!";
    StringsChars stringChar = new StringsChars();
    int charUnicode = stringChar.getCharUnicode(text, 2);
    assertEquals(105, charUnicode);
  }

  @Test
  @DisplayName("codePointBefore - Returns the Unicode of the character before specified index")
  void getUnicodeOfcharBeforeIndex() {
    String text = "This is test!";
    StringsChars stringChar = new StringsChars();
    int charUnicode = stringChar.getCharUnicodeBeforeIndex(text, 2);
    assertEquals(104, charUnicode);
  }

  @Test
  @DisplayName("codePointCount - Returns the number of Unicode values found in string")
  void getNumberOfUnicodeValuesInString() {
    String text = "This is test!";
    StringsChars stringChar = new StringsChars();
    int charUnicode = stringChar.getNumberOfUnicodeValuesInString(text);
    assertEquals(13, charUnicode);
  }

  @Test
  @DisplayName("compareTo - Compares two strings lexicographically")
  void comparesTwoStringsLexicographically() {
    String text1 = "Zhis is test!";
    String text2 = "Xhis is test!";
    StringsChars stringChar = new StringsChars();
    int result = stringChar.comparesTwoStringsLexicographically(text1, text2);
    assertEquals(2, result);
  }

  @Test
  @DisplayName("compareToIgnoreCase - Compares two strings lexicographically ignoring the case")
  void comparesTwoStringsLexicographicallyIgnoringCase() {
    String text1 = "This is test!";
    String text2 = "this is test!";
    StringsChars stringChar = new StringsChars();
    int result = stringChar.comparesTwoStringsLexicographicallyIgonreCase(text1, text2);
    assertEquals(0, result);
  }

  @Test
  @DisplayName("concat - Appends a string to the end of another string")
  void concatStringToString() {
    String string = "string + ";
    String text = "text";
    StringsChars stringsChars = new StringsChars();
    String result = stringsChars.concatStrings(string, text);
    assertEquals("string + text", result);
  }

  @Test
  @DisplayName("contains - Checks whether a string contains a sequence of characters")
  void containsString() {
    String string = "string + ";
    String text = "rin";
    StringsChars stringsChars = new StringsChars();
    boolean result = stringsChars.containsString(string, text);
    assertTrue(result);
  }

  @Test
  @DisplayName("contentEquals - Checks whether a string contains the exact same sequence of characters")
  void contentEqual() {
    String string = "string + ";
    String text = "string + ";
    StringsChars stringsChars = new StringsChars();
    boolean result = stringsChars.contentEqual(string, text);
    assertTrue(result);
  }

    @Test
    @DisplayName("copyValueOf - Return a String that represents certain characters of a char array")
    void copyValueOf() {
      char[] chars = {'Y', 'a', 's', 's', 'i', 'r'};
      StringsChars stringsChars = new StringsChars();
      String result = stringsChars.copyValueOf(chars);
      assertEquals("Yassir", result);
  }

  @Test
  @DisplayName("endsWith - Find out if the string ends with the specified characters")
  void endsWith() {
    String string = "string text";
    StringsChars stringsChars = new StringsChars();
    boolean result = stringsChars.endsWith(string, " text");
    assertTrue(result);
  }

  @Test
  @DisplayName("Compare strings to find out if they are equal")
  void equals() {
    String string = "string text";
    String text = "string text";
    StringsChars stringsChars = new StringsChars();
    boolean result = stringsChars.equales(string, text);
    assertTrue(result);
  }

  @Test
  @DisplayName("equals - Compare strings to find out if they are equal")
  void equalsIgnoreCase() {
    String string = "string Text";
    String text = "stRing text";
    StringsChars stringsChars = new StringsChars();
    boolean result = stringsChars.equalsIgnoreCase(string, text);
    assertTrue(result);
  }

  @Test
  @DisplayName("format - Return a formatted string")
  void formatString() {
    String string = "The word %s has %s words!";
    String text = "qweocmnqerovinqerv";
    int number = 2048;
    StringsChars stringsChars = new StringsChars();
    String result = stringsChars.formatString(string, text, number);
    assertEquals("The word qweocmnqerovinqerv has 2048 words!", result);
  }

  @Test
  @DisplayName("getBytes - Convert a string into a byte array")
  void getBytes() {
    String string = "The word";
    StringsChars stringsChars = new StringsChars();
    byte[] result = stringsChars.getBytes(string);
    assertEquals(84, result[0]);
  }

  @Test
  @DisplayName("getChars - Copy part of a string into a char array")
  void getChars() {
    char[] myArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    String string = "Hello, World!";
    StringsChars stringsChars = new StringsChars();
    int startIndex = 4;
    int endIndex = 7;
    int destinationStartIndex = 4;
    System.out.println(myArray);
    char[] result = stringsChars.getChars(myArray, startIndex, endIndex, destinationStartIndex, string);
    System.out.println(result);
    char[] expectedArray = {'0', '1', '2', '3', 'o', ',', ' ', '7', '8', '9'};
    assertEquals(expectedArray[4], result[4]);
  }

  @Test
  @DisplayName("hashCode - Return the hash code of a string")
  void hashCodeResult() {
    String string = "The word word";
    StringsChars stringsChars = new StringsChars();
    int result = stringsChars.hashCodeResult(string);
    assertEquals(-601243311, result);
  }

  @Test
  @DisplayName("indexOf - method returns the position of the first occurrence of specified character(s) in a string")
  void findIndexOf() {
    String string = "The word word";
    StringsChars stringsChars = new StringsChars();
    int result1 = stringsChars.findIndexOf(string, "word");
    assertEquals(4, result1);

    int result2 = stringsChars.findIndexOf(string, "h", 0);
    assertEquals(1, result2);

    int result3 = stringsChars.findIndexOf(string, 100);
    assertEquals(7 , result3);
  }

  @Test
  @DisplayName("isEmpty - Find out if a string is empty or not")
  void findIFStringIsEmpty() {
    String string = "The word word";
    String text = "";
    StringsChars stringsChars = new StringsChars();
    boolean result1 = stringsChars.findIFStringIsEmpty(string);
    boolean result2 = stringsChars.findIFStringIsEmpty(text);

    assertFalse(result1);
    assertTrue(result2);
  }

  @Test
  @DisplayName("hashCode - Return the hash code of a string")
  void joinStrings() {
    String string1 = "The word";
    String string2 = "is not";
    String string3 = "good out there!";
    String separator = " ";

    StringsChars stringsChars = new StringsChars();
    String result1 = stringsChars.joinStrings(separator, string1, string2);

    List<String> strings = Arrays.asList(string1, string2, string3);
    String result2 = stringsChars.joinStrings(separator, strings);

    assertEquals("The word is not", result1);

    assertEquals("The word is not good out there!", result2);
  }

  @Test
  @DisplayName("lastIndexOf - Returns the position of the last found occurrence of specified characters in a string")
  void findLastIndexOf() {
    String string = "The word is bad! is weovkm is";
    StringsChars stringsChars = new StringsChars();

    int result1 = stringsChars.findLastIndexOf(string, "is");
    assertEquals(27, result1);

    int result3 = stringsChars.findLastIndexOf(string, 101);
    assertEquals(21, result3);

    int result4 = stringsChars.findLastIndexOf(string, 101, 9);
    assertEquals(2, result4);

        System.out.println(string.indexOf("is"));
    int result2 = stringsChars.findLastIndexOf(string, "is", 11);
    assertEquals(12, result2);
  }

  @Test
  @DisplayName("matches - Check whether a string matches the regular expression")
  void doMatches() {
    String string1 = "He who speak the word is weovk";
    String string2 = "word";
    String string3 = "weovk";


    String regex = "The|word|is|bad|weovkm";
    StringsChars stringsChars = new StringsChars();

    boolean result1 = stringsChars.doMatches(string1, regex);
    assertFalse(result1);

    boolean result2 = stringsChars.doMatches(string2, regex);
    assertTrue(result2);

    boolean result3 = stringsChars.doMatches(string3, regex);
    assertFalse(result3);
  }

  @Test
  @DisplayName("offsetByCodePoints - Get an index from a string which is offset from another index by a number of code points")
  void findOffsetByCodePoints() {
    String string = "He who speak the word is weovk";
    StringsChars stringsChars = new StringsChars();

    int result = stringsChars.findOffsetByCodePoints(string, 5, 5);
    assertEquals(10, result);
    assertThat(result).isEqualTo(10);
  }

  @Test
  @DisplayName("offsetByCodePoints - Get an index from a string which is offset from another index by a number of code points")
  void doRegionMatches() {
    String string1 = "He who speak the word is weovk";
    String string2 = "He who weovk";
    StringsChars stringsChars = new StringsChars();

    boolean result = stringsChars.doRegionMatches(true, 0, string1, 0, 5, string2);
    assertTrue(result);
    assertThat(result).isTrue();
  }

  @Test
  @DisplayName("offsetByCodePoints - Get an index from a string which is offset from another index by a number of code points")
  void doReplace() {
    String string = "He who speak the word is weovk";
    StringsChars stringsChars = new StringsChars();

    String result = stringsChars.doReplace(string, 'e', 'X');
    assertEquals("HX who spXak thX word is wXovk",result);
  }

  @Test
  @DisplayName("replaceAll - Replace every match of a regular expression with a substring")
  void doReplaceAll() {
    String string = "I love cats. Cats are very easy to love. Cats are very popular.";
    String regex = "(?i)cat";
    StringsChars stringsChars = new StringsChars();
    String replacementString = "dog";
    String result = stringsChars.doReplaceAll(regex, string, replacementString);
    assertEquals("I love dogs. dogs are very easy to love. dogs are very popular.",result);
  }

  @Test
  @DisplayName("replaceFirst - Replace the first match of a regular expression with a different substring")
  void doReplaceFirst() {
    String string = "I hate cats.";
    String regex = "hate";
    StringsChars stringsChars = new StringsChars();
    String replacementString = "love";
    String result = stringsChars.doReplaceFirst(regex, string, replacementString);
    assertEquals("I love cats.",result);
    assertThat(result).isEqualTo("I love cats.");
  }

  @Test
  @DisplayName("split - Split a string into an array of strings")
  void doSplit() {
    String string = "I love cats They";
    String regex = "[.\\s\\,\\!]";
    String[] expectedResult = {"I","love","cats","They"};
    StringsChars stringsChars = new StringsChars();
    int lengthLimit = 15;
    String[] result = stringsChars.doSplit(regex, string, lengthLimit);
    assertArrayEquals(expectedResult,result);
    assertThat(expectedResult).isEqualTo(result);
  }

  @Test
  @DisplayName("startsWith - Find out if the string starts with the specified characters")
  void doStartsWith() {
    String string = "Oh! I love cats They";
    String startText = "Oh!";
    StringsChars stringsChars = new StringsChars();
    boolean result = stringsChars.doStartsWith(string, startText);
    assertTrue(result);
    assertThat(result).isTrue();
  }

  @Test
  @DisplayName("subSequence - Return a sequence of characters from a string")
  void doSubSequence() {
    String string = "Oh! I love cats They";
    StringsChars stringsChars = new StringsChars();
    CharSequence result = stringsChars.doSubSequence(string, 7, 12);
    assertEquals("ove c",result);
    assertThat(result).isEqualTo("ove c");
  }

  @Test
  @DisplayName("substring - Return a substring from a string")
  void doSubstring() {
    String string = "Oh! I love cats They";
    StringsChars stringsChars = new StringsChars();
    String result = stringsChars.doSubstring(string, 7, 12);
    assertEquals("ove c",result);
    assertThat(result).isEqualTo("ove c");
  }

  @Test
  @DisplayName("substring - Return a substring from a string")
  void doSubstring2() {
    String string = "Oh! I love cats They";
    StringsChars stringsChars = new StringsChars();
    String result = stringsChars.doSubstring2(string, 7);
    assertEquals("ove cats They",result);
    assertThat(result).isEqualTo("ove cats They");
  }

  @Test
  @DisplayName("toCharArray - Convert a string to a char array")
  void doToCharArray() {
    String string = "Oh! I love cats They";
    StringsChars stringsChars = new StringsChars();
//    char[] result = stringsChars.doToCharArray(string);
//    char[] expected = new char[20]{'e', 'r'};
//    assertArrayEquals(expected,result);
//    assertThat(result).isEqualTo(new char[]{'d'});
  }

  @Test
  @DisplayName("toUpperCase - Convert a string to upper case letters")
  void doToUpperCase() {
    String string = "Oh! I love cats They";
    StringsChars stringsChars = new StringsChars();
    String expected = "OH! I LOVE CATS THEY";
    String result = stringsChars.doToUpperCase(string);
    assertEquals(expected,result);
    assertThat(result).isEqualTo(expected);
  }

  @Test
  @DisplayName("toLowerCase - Convert a string to lower case letters")
  void doToLowerCase() {
    String string = "Oh! I love cats They";
    StringsChars stringsChars = new StringsChars();
    String expected = "oh! i love cats they";
    String result = stringsChars.doToLowerCase(string);
    assertEquals(expected,result);
    assertThat(result).isEqualTo(expected);
  }

  @Test
  @DisplayName("toString - Return a string's value")
  void doToString() {
    String string = "Oh! I love cats They";
    StringsChars stringsChars = new StringsChars();
    String expected = "Oh! I love cats They";
    String result = stringsChars.doToString(string);
    assertEquals(expected,result);
    assertThat(result).isEqualTo(expected);
  }

  @Test
  @DisplayName("valueOf - Return a string representation of different data types")
  void doValueOf() {

    char[] myArray = {'a', 'b', 'c'};;
    StringsChars stringsChars = new StringsChars();
    String expected = "abc";
    String result = stringsChars.doValueOf(myArray);
    assertEquals(expected,result);
    assertThat(result).isEqualTo(expected);

    System.out.println(String.valueOf('A'));
    System.out.println(String.valueOf(true));
    System.out.println(String.valueOf(4.5f));
    System.out.println(String.valueOf(5.2));
    System.out.println(String.valueOf(12));
    System.out.println(String.valueOf(1400L));
  }
}
