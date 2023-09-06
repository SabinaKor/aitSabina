package lesson37;

import java.util.List;

public class HW37 {
    /*
    Написать метод, принимающий не пустой лист строк и
    возвращающий строку, которая встречается раньше в листе -
    самую короткую или самую длинную. Все строки в листе разной длины
     */
    public static void main(String[] args) {
        List<String> stringList = List.of("short", "longest", "main", "static");
        String result = findShororLong(stringList);
        System.out.println(result);
    }
    public static String findShororLong(List<String> str) {
        if (str.isEmpty()) {
             return "ne mozhet byt pustym";
        }
        String shortest = str.get(0);
        String longest = str.get(0);
        for (String string : str) {
            if (string.length() < shortest.length()) {
                shortest = string;
            } else if (string.length() > longest.length()) {
                longest = string;
            }
        }
        int shortestIndex = str.indexOf(shortest);
        int longestIndex = str.indexOf(longest);
        return shortestIndex < longestIndex ? shortest : longest;
    }
}
