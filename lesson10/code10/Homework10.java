import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args) {
        /*
        Task 0
        Заполните массив 20 случайными целыми числами.
        Программа должна вывести на экран массив, количество четных чисел
        в массиве и сумму всех четных чисел.
         */
        Random random = new Random();
        int[] array = new int[20];
        int evenCh = 0;
        int Sum = 0;
        for (int k = 0; k < array.length; k++) {
            array[k] = random.nextInt(100);

            if (array[k] % 2 == 0) {
                evenCh++;
                Sum += array[k];
            }
        }
        System.out.println("Massiv: " + Arrays.toString(array) + ", kol-vo chetnyh chisel: " + evenCh + ", summa chetnyh: " + Sum);

        /*
        Task 1

        За каждый месяц банк начисляет к сумме вклада 7% от суммы.
        Напишите консольную программу, в которую пользователь вводит
        сумму вклада и количество месяцев.
        А банк вычисляет конечную сумму вклада с учетом начисления
        процентов за каждый месяц. Для вычисления суммы с учетом
        процентов используйте цикл for.

        Пусть сумма вклада будет представлять тип float.

        Введите сумму вклада: 100
        Введите срок вклада в месяцах: 1
        После 1 месяцев сумма вклада составит 107,00
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада: ");
        float sum = scanner.nextFloat();
        System.out.println("Введите срок вклада в месяцах: ");
        float mon = scanner.nextFloat();

        for (int month = 1; month <= mon; month++) {
            float amount = sum * 0.07f;
            sum += amount;
        }
        System.out.println("После 1 месяцев сумма вклада составит: " + sum);

        System.out.println();
        System.out.println("_______");

        /*
       Task 2

        Заполните массив 50 случайными числами от 1 до 100.
        Программа должна найти, и вывести на экран все простые числа.
        Посчитайте сколько получилось таких чисел в массиве.
        Простое число - число, которое делится на цело только на 1 и само себя.

        Пример простых чисел: 3, 5, 7, 11, 13 и т.д.
         */
        int[] array2 = new int[50];
        int ch = 0;
        for (int l = 0; l < array2.length; l++) {
            array2[l] = random.nextInt(100) + 1;

                boolean prime = true;
                for (int m = 2; m < array2[l]; m++) {
                    if (array2[l]%m==0){
                        prime=false;
                    }
                }
                if (prime){
                    System.out.println(array2[l] + " prime");
                    ch++;
                }
        }
        System.out.println("сколько получилось таких чисел в массиве: "+ch);
        System.out.println(Arrays.toString(array2));

    }
}