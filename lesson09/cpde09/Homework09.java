import java.util.Arrays;
import java.util.Random;

public class Homework09 {
    public static void main(String[] args) {
        /*
        Task 0 Дан массив целых чисел. Вывести на экран:

        его минимальное значение
        максимальное
        среднее арифметическое
         */
        System.out.println("Task 0:  ");
        int[] array= {45, 78, -3, 665};
        System.out.println("Massiv celyh chisel: "+ Arrays.toString(array));

        int max = array[0];
        int maxindex = 0;

        int min=array[0];
        int minindex = 0;

        int i = 0;
        while (i < array.length) {

            if (array[i] > max) {
                max = array[i];
                maxindex = i;
            }
            if (array[i] < min) {
                min = array[i];
                minindex = i;
            }
            i++;
        }
        System.out.println("Max: "+max+ " ,min: "+min);
        int currentindex = 0;
        int sum1 = 0;
        while (currentindex < array.length) {
            sum1 += array[currentindex];
            currentindex++;
        }
        System.out.println(array.length);
        System.out.println(sum1/ array.length);

// {45, 78, -3, 665};

//
//        double averageArray = ((double) ( array[0] + array[1] + array[2]+ array[3]) / 4);
//        System.out.println("AverageArray: "+ averageArray);



        /*
        Task 1 Дан массив целых чисел. Поменять местами его максимальный и минимальный элемент

                Пример:

            { 5, 6, -25, 0, 31, -15 }  ->  { 5, 6, 31, 0, -25, -15}
         */
        System.out.println("Task 2:   ");
        int[] array2 = {6, 89, 23, -56, 77, -1};
        System.out.println("Massiv celih chisel2: "+ Arrays.toString(array2));
        int max2 = array2[0];
        int maxind = 0;

        int min2=array2[0];
        int minind = 0;

       int in = 0;
        while (in < array2.length) {

            if (array2[in] > max2) {
                max2 = array2[i];
                maxind = in;
            }
            if (array2[in] < min2) {
                min2 = array2[i];
                minind = in;
            }
            i++;
        }

        int temp = array2[maxindex];
        array2[maxindex] = array2[minindex];
        array2[minindex] = temp;

        System.out.println("Massiv celih chisel2 after swap: " + Arrays.toString(array2));

        /*
        Дан массив строк. Вывести на экран все символы из самой длинной строки массива
         */
        String[] string= {"Boolean", "Programming", "One"};
        int length0= string[0].length();
        System.out.println("Length 0: "+ length0);
        int length1= string[1].length();
        System.out.println("Length 1: "+ length1);
        int length2= string[2].length();
        System.out.println("Length 2: "+length2);
        int maxLength= 0;
        int index=0;
        int lengths = 0;
        int maxindexs = 0;
        while (index<string.length){
            if (string[index].length() > maxLength) {
                maxLength = string[index].length();
                maxindexs=index;
            }
            index++;
        }

        System.out.println("Samaya dlinnaya stroka massiva: " + maxLength);
        System.out.println(string[maxindexs]);








    }
}
