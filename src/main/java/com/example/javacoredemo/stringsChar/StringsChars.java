package com.example.javacoredemo.stringsChar;

import java.util.List;

import static java.lang.String.join;

public class StringsChars {

  public void demo(){
    System.out.println("Strings and Chars... run the tests to see how it works");
  }

  public char getChar(String text, int index) {
    return text.charAt(index);
  }

  public int getCharUnicode(String text, int index) {
    return text.codePointAt(index);
  }

  public int getCharUnicodeBeforeIndex(String text, int index) {
    return text.codePointBefore(index);
  }

  public int getNumberOfUnicodeValuesInString(String text) {
    return text.codePointCount(0, text.length());
  }

  public int comparesTwoStringsLexicographically(String text1, String text2) {
    return text1.compareTo(text2);
  }

  public int comparesTwoStringsLexicographicallyIgonreCase(String text1, String text2) {
    return text1.compareToIgnoreCase(text2);
  }

  public String concatStrings(String string, String text) {
    return string.concat(text);
  }

  public boolean containsString(String string, String text) {
    return string.contains(text);
  }

  public boolean contentEqual(String string, String text) {
    return string.contentEquals(text);
  }

  public String copyValueOf(char[] chars) {
    return "".copyValueOf(chars, 0, chars.length);
  }

  public boolean endsWith(String string, String endString) {
    return string.endsWith(endString);
  }

  public boolean equales(String string, String text) {
    return string.equals(text);
  }

  public boolean equalsIgnoreCase(String string, String text) {
    return string.equalsIgnoreCase(text);
  }

  public String formatString(String string, String text, int number) {
    return String.format(string, text, number);
  }

  public byte[] getBytes(String string) {
    return string.getBytes();
  }

  public char[] getChars(char[] myArray, int startIndex, int endIndex, int destinationStartIndex, String string) {
    string.getChars(startIndex, endIndex, myArray, destinationStartIndex);
    return myArray;
  }

  public int hashCodeResult(String string) {
    return string.hashCode();
  }

  public int findIndexOf(String string, String text) {
    return string.indexOf(text);
  }

  public int findIndexOf(String string, String text, int fromIndex) {
    return string.indexOf(text, fromIndex);
  }

  public int findIndexOf(String string, int unicodeValue) {
    return string.indexOf(unicodeValue);
  }

  public boolean findIFStringIsEmpty(String string) {
    return string.isEmpty();
  }

  public String joinStrings(String separator, String string1, String string2) {
    return join(separator, string1, string2);
  }

  public String joinStrings(String separator, List<String> strings) {
    return join(separator, strings);
  }

  public int findLastIndexOf(String string, String text) {
    return string.lastIndexOf(text);
  }

  public int findLastIndexOf(String string, String text, int fromIndex) {
    return string.lastIndexOf(text, fromIndex);
  }

  public int findLastIndexOf(String string,int unicodeValue) {
    return string.lastIndexOf(unicodeValue);
  }

  public int findLastIndexOf(String string,int unicodeValue, int fromIndex) {
    return string.lastIndexOf(unicodeValue, fromIndex);
  }

  public boolean doMatches(String string,String regex) {
    return string.matches(regex);
  }

  public int findOffsetByCodePoints(String string,int index, int codePointOffset) {
    return string.offsetByCodePoints(index, codePointOffset);
  }

  public boolean doRegionMatches(boolean ignoreCase, int offset, String string1, int otherOffset, int length, String string2) {
    return string1.regionMatches(ignoreCase, offset, string2, otherOffset, length);
  }

  public String doReplace(String string, char searchCar, char replaceChar) {
    return string.replace(searchCar, replaceChar);
  }

  public String doReplaceAll(String regex, String string, String replacementString) {
    return string.replaceAll(regex, replacementString);
  }

  public String doReplaceFirst(String regex, String string, String replacementString) {
    return string.replaceFirst(regex, replacementString);
  }

  public String[] doSplit(String regex, String string, int lengthLimit) {
    return string.split(regex, lengthLimit);
  }

  public boolean doStartsWith(String string, String startText) {
    return string.startsWith(startText);
  }

  public CharSequence doSubSequence(String string, int startIndex, int endIndex) {
    return string.subSequence(startIndex, endIndex);
  }

  public String doSubstring(String string, int startIndex, int endIndex) {
    return string.substring(startIndex, endIndex);
  }

  public String doSubstring2(String string, int startIndex) {
    return string.substring(startIndex);
  }

  public char[] doToCharArray(String string) {
    return string.toCharArray();
  }

  public String doToLowerCase(String string) {
    return string.toLowerCase();
  }

  public String doToUpperCase(String string) {
    return string.toUpperCase();
  }

  public String doToString(String string) {
    return string.toString();
  }

  public String doTrim(String string) {
    return string.trim();
  }

  public String doValueOf(char[] myArray) {
    return String.valueOf(myArray);
  }
}
