import java.util.Random;
import java.util.Scanner;

public class Homework06 {
    public static void main(String[] args) {

        /*
        Task 0

        Необходимо написать программу, где бы
         пользователю предлагалось ввести число на выбор:
          1, 2 или 3, а программа должна сказать,
          какое число ввёл пользователь: 1, 2, или 3


         */
        /* Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite chislo na vybor ot 1 do 3: ");

        int userInputInt = scanner.nextInt();
        if (userInputInt == 1) {
            System.out.println("Vy vvely chislo 1: ");

        } else if (userInputInt == 3) {
            System.out.println("Vy zhe vveli chislo 3:");
        } else if (userInputInt == 2) {
            System.out.println("Vy vveli chislo 2");
        } else {
            System.out.println("Ya zhe prosila ot 1 do 3...");
        }

         */



        /*
        Task 1

        Запишите в 4 переменные случайные числа от 0 до 100
        Выведите все 4 на экран
        Программа должна определить максимальное из этих четырех чисел
        Результат вывести на экран
         */

        Random random = new Random();
        int var1 = 33;
        System.out.println("Chislo 1: " + var1);
        int var2 = 5;
        System.out.println("Chislo 2: " + var2);
        int var3 = 56;
        System.out.println("Chislo 3: " + var3);
        int var4 = 18;
        System.out.println("Chislo 4: " + var4);
        // int max = Math.max(var1, Math.max(var2, Math.max(var3, var4)));
        //System.out.println("Max chislo iz etih 4 chisel: " + max);

        int max = var1;

        if (var2 > max) {
            max = var2;
        } else if (var3 > max) {
            max = var3;
        } else if (var4 > max) {
            max = var4;
        }

        System.out.println("Max chislo s if-else: " + max);

        /*
        Task 2 *Повышенной сложности (опционально)

        программа предлагает пользователю ввести четырехзначное число
        Причем: мы можем получать от пользователя ТОЛЬКО строки. Данные в формате String
        Если число не четырехзначное, должно вывестись на экран
        сообщение об ошибке и работа программы завершается
        Проверить, является ли число "счастливым билетом". Т.е.
        совпадает ли сумма цифр первых двух цифр числа с суммой третьей и четвертой цифры
        Пример:

        число 1450 -> (1+4) = 5; (5+0) = 5; 5 равно 5 - число счастливое
        число 1654 -> (1+6) = 7; (5+4) = 9; 7 не равно 9 - число НЕ является счастливым
                 */
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite 4znachnoe chislo: ");
        String numberInString = scanner.nextLine();
        String str1= "Slovo";
        int parseInt= Integer.parseInt(str1);
        System.out.println();

         */



//        System.out.println(numberInString);





    }
}
