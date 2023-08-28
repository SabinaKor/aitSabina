import java.util.Arrays;

public class Practice {
    /* 1. написать свою реализацию метода substring, который работает также как
    метод substring  класса String , принимающий два аргумента - индекс начала
    и индекс конца. Метод substring  класса String  не использовать :)
    2. Написать метод, проверяющий являются ли две строки анаграммами
    abc - cba  rosa - asor - анаграмма
    abc - dba  - не анаграмма
    boolean isAnagram( String str1, String str2)
     */
    public static void main(String[] args) {
        String string = "Hello java";
        String result = mySubstring(string, 1, 5);
        System.out.println(result);

        String str1="abc";
        String str2="cba";
        System.out.println(isAnagram(str1, str2));
    }
    public static String mySubstring(String str, int startIndex, int endIndex) {
        int length = str.length();
        if (startIndex < 0) {
            startIndex = 0;
        }
        if (endIndex > length) {
            endIndex = length;
        }
        if (startIndex > endIndex) {
            return "";
        }
        char[] resultChars = new char[endIndex - startIndex];
        for (int i = startIndex; i < endIndex; i++) {
            resultChars[i - startIndex] = str.charAt(i);
        }
        return new String(resultChars);
    }
    public static boolean isAnagram(String str1,String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] chars =str1.toCharArray();
        Arrays.sort(chars);
        char[] chars1=str2.toCharArray();
        Arrays.sort(chars1);
        return Arrays.equals(chars,chars1);

    }
}
