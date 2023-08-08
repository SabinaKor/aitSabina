import java.util.Arrays;

public class Homework12 {
    public static void main(String[] args) {
        /*
        Task 0
        Написать метод принимающий целое число и
        проверяющий является ли число простым.
        Если является, метод должен вернуть true,
        не является - false
         */
        boolean answer = isprime(16);
        System.out.println(answer);

        /*
        Task 1
        Написать метод, принимающий массив целых чисел.
        Метод должен вернуть количество простых чисел в массиве.
        Для проверки на "простоту" числа рекомендуется использовать метод из Task 0
         */
        int[] array={12,3,7,99,25,11};
        int answer2=arrayis(array);
        System.out.println(answer2);

        /*
        Task 3
        Написать метод, принимающий на вход массив строк.
        Метод должен вернуть массив, состоящий из самой короткой
        и самой длинной строки изначального массива.
         */
        String[] str={"HomeWork","MethodVoid","LoopFor","Photosynthesis"};
        String answer3= Arrays.toString(isString(str));
        System.out.println(answer3);
    }
    public static boolean isprime(int a){
        boolean prime = true;
        for (int m = 2; m < a; m++) {
            if (a%m==0){
                prime=false;
            }
        }
           return prime;
    }
    public static String[] isString(String[]str){
        int maxLength= 0;
        int maxindex = 0;
        int minIndex=0;
        for (int a=0;a<str.length;a++ ){
            if (str[a].length() > maxLength) {
                maxLength = str[a].length();
                maxindex=a;
            }
        }
        int minLength=maxLength;
        for (int a=0;a<str.length;a++ ){
            if (str[a].length() < minLength) {
                minLength = str[a].length();
                minIndex=a;
            }
        }
        String[] answer_array={str[maxindex],str[minIndex]};
        return answer_array;
    }
    public static int arrayis(int[] arr){
        int ch = 0;
        for (int l = 0; l < arr.length; l++) {
            boolean prime = true;
            for (int m = 2; m < arr[l]; m++) {
                if (arr[l]%m==0){
                    prime=false;
                }
            }
            if (prime){
                System.out.println(arr[l] + " prime");
                ch++;
            }
        }

        System.out.println("сколько получилось таких чисел в массиве: "+ch);
        System.out.println(Arrays.toString(arr));
        return ch;
    }
}




