import java.util.Arrays;

public class HW_25 {


       // System.out.println(str1.endsWith("Java"));
       public static void main(String[] args) {
           String str1="Hello Java";
           String str2="Java";
           boolean answer=strEndsWithAnotherStr(str1, str2);
           System.out.println(answer);


           String str="Raccoon";
           char[] charArray = createsCharArray(str);
           System.out.println(Arrays.toString(charArray));



           String string = "abbccccaadb";
           String answer1 = removeDuplicateChars(string);
           System.out.println(answer1);

       }
    /*
            Задача 1
    Написать метод, проверяющий заканчивается ли строка содержимым
    другой строки.
    public boolean strEndsWithAnotherStr ( String str1, str2)
             */
    public static boolean strEndsWithAnotherStr ( String str1, String str2){
        String substr=str1.substring(str1.length()-str2.length());
        if (substr.equals(str2)){
            return true;
        } else return false;
    }
     /*
       Задача2
   Написать метод, создающий массив символов из содержимого строки
   public char[] createsCharArray( String str)
        */
    public static char[] createsCharArray( String str){
        int length = str.length();
        char[] charArray = new char[length];
        for (int i = 0; i < length; i++) {
            charArray[i] = str.charAt(i);
        }
        return charArray;
    }
    /*
    Задача 3*
  Написать метод, удаляющий из строки повторяющиеся символы
  String removeDuplicateChars( String string)
  пример: "abbccccaadb" -> "abcd"
     */
    public static String removeDuplicateChars(String string) {
        String result = "";
        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);
            if (result.indexOf(currentChar) == -1) {
                result += currentChar;
            }
        }
        return result;
    }

}
