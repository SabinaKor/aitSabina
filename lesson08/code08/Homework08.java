import java.util.Scanner;

public class Homework08 {
    public static void main(String[] args) {
        /*
        Task 0 Распечатать 10 строк: “Task1”. “Task2”. … “Task10”.
        Используем цикл while
         */
        int str = 1;
        while (str <= 10) {
            System.out.print("Task" + str++ +" ");
        }
        System.out.println("_________");

        /*
        Task 1 Распечатать все числа от 1 до 100,
        которые делятся на 5 без остатка. Используем цикл do-while
         */
//        int num=1;
//        do {
//            if (num % 5 == 0) {
//                System.out.println(num++);
//            }
//        } while (num <= 100);

        int num = 1;
        do {
            if (num % 5 == 0) {
                System.out.print( num+ " ");
            }
            num++;
        } while (num <= 100) ;


        System.out.println("=======");

        /*
        Task 2 Распечатать только 7 чисел
        от 1 до 100, которые делятся на 5 без остатка. Используем цикл while
         */
        int num2=1;

        while (num2<=100){
            if (num2%7==0){
            System.out.print(num2++);
            }
            num2++;
        }

        System.out.println("---------");

        /*
        Task 3 Программа просит пользователя слово "hello"
        Если пользователь вводит правильное слово - программа
        распечатывает на экран благодарность и завершает работу
         Если вводится не верное слово - программа просит ввести
         слово снова. До тех пор, пока не будет введено запрашиваемое слово
         */

//        System.out.println("Vvedite slovo hello");
        Scanner scanner=new Scanner(System.in);
//        String word = "hello";
//        String userInput;
//        userInput = scanner.nextLine();
//
//        do {
//            if (userInput.equalsIgnoreCase(word)) {
//                System.out.println("Spasibo! Vy vveli pravilnoe slovo");
//
//            } else {
//                System.out.println("Vvedite slovo snova. Tolko na etot raz 'hello");
//            }
//        } while (userInput.equalsIgnoreCase(word));

        /*
        Task 4 Программа просит пользователя ввести
        произвольное число Вывести сумму цифр этого числа
           567432 -> 5+6+7+4+3+2 -> 27
         */
//        Scanner scanner1=new Scanner(System.in);
//        System.out.println("Vvedite proizvolnoe chislo ");
//        int num3=scanner.nextInt();
//        int sum = 0;
//        int tempnum = num2;
//        while (tempnum != 0) {
//            int num4 = num % 10;
//            sum += (num4 >= 0) ? num4 : -num4;
//            tempnum /= 10;
//        }
//
//        System.out.println("Summa civr chisla: " + sum);

        //task3
         int counter=1;
         int amount=0;
         while (counter<=100|| amount<7){
             if ((counter%5)==0){
                 System.out.println(counter+" ");
                 amount++;
             }
             counter++;
         }
        System.out.println("amount"+amount);



    }
}
