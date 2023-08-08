import java.util.Random;

public class Homework11 {
    public static void main(String[] args) {


        /*
        Task 0
         Написать метод, принимающий массив целых чисел и
        распечатывающий массив в обратной последовательности.

        {1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]
        Перегрузить метод, если в него приходит индекс,
        то часть массива слева до этого индекса распечатывается в обычном порядке,
        а начиная с этого индекса в обратном:

        {1, 4, 3, 6, 7} + индекс 2 - > распечатывает [1, 4, 7, 6, 3]
        Еще одна перегрузка: метод принимает массив и булевый флаг.
        Если флаг == true -> печатает массив в обратном порядке
        Если флаг == false -> печатает массив в прямом порядке
         */
        int[] array = {7, 9, 23, 66, 4};
        printArray(array);
        printArray(array, 3);
        printArray(array,false);

         /*
      Task 1

        Написать метод, принимающий на вход целое число. Метод должен вывести на экран 2 в степени этоЧисло

        класс Math для нахождения степени числа использовать нельзя ;)
     */
        printPower(4);
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    public static void printArray(int[] array, int index) {
        System.out.print("[");
        for (int k=0; k< index; k++) {
            System.out.print(array[k]);
            if (k!= array.length-1)
                System.out.print(", ");
        }

        for (int i = array.length - 1; i >= index; i--) {
            System.out.print(array[i]);
            if (i !=index) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }
    public static void printArray(int[] array, boolean flag) {
        if (flag == true) {
            printArray(array);

        }
        if (flag == false){
            System.out.print("[");
            for (int a=0; a<array.length; a++){
                System.out.print(array[a]);
                if (a !=array.length-1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }

    public static void printPower(int a){
        int sum = 1;
        int count = 0;
        while(count<a){
            sum=sum*2;
            count++;

        }
        System.out.println(sum);

    }

}