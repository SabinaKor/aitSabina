import java.util.Random;
import java.util.Scanner;

public class Homework07 {
    public static void main(String[] args) {
        /*
        Task 1 (Использовать оператор switch)

      Программа просит пользователя ввести число от 1 до 7
        Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так далее. Если 6 или 7 – “Выходной”.

         */
        Scanner scanner =new Scanner(System.in);
        System.out.println("Vvedite chislo ot 1 do 7 ");
        int answer =scanner.nextInt();

        switch (answer) {
            case 1:
                System.out.println("ponedelnik");
                break;
            case 2:
                System.out.println("vtornik");
                break;
            case 3:
                System.out.println("sreda");
                break;
            case 4:
                System.out.println("chetverg");
                break;
            case 5:
                System.out.println("pt");
                break;
            case 6:
            case 7:
                System.out.println("vyhodnoi");
                break;
            default:
                System.out.println("error");
        }

        {
            int note;
            int min=45;

            Random random=new Random();
            note=random.nextInt(13);
            System.out.println("ocenka"+note);

            switch (note){
                case 10:
                case 11:
                case 12:
                    System.out.println("ya rad!");
                    min +=60; //potomu chto 1 chas = 60 min
                    break;
                case 7:
                case 8:
                case 9:
                    System.out.println("slova pahvaly");
                    min+=45;
                    break;
                case 4:
                case 5:
                case 6:
                    System.out.println("neitralnye slova");
                    min +=15;
                    break;
                case 3:
                    System.out.println("ogorchilsya");
                    min-=30;
                    break;
                case 2:
                case 1:
                    System.out.println("tragediya");
                    min=0;
                    break;
                default:
                    System.out.println("da ty zhulik");
            }
            System.out.println("na segodnya ostalos "+min+ "minut");




        }

    }
}
