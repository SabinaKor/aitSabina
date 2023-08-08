import java.util.Random;
import java.util.Scanner;

public class WhileDo {
    public static void main(String[] args) {

//        int i=0;
//        while (i <=10){
//
//            System.out.println("hello"+ i++);
//           // System.out.println("schetshik"+i);
//           // i++ - i=i+1;
//            //telo cikla
//        }
//
//        System.out.println("cikl1 zavershen");
//        System.out.println("========");
//         i=100;
//        while (i >90){
//
//            System.out.println("hello"+ i--);
//            // System.out.println("schetshik"+i);
//            // i++ - i=i+1;
//            //telo cikla
//        }
//        System.out.println("cikl zavershen");
//
//        int y=0;
//        Random random=new Random();
//        int randomNum, count12=0, count13=0;
//        while (y<1_000_000) {
//            randomNum=random.nextInt(13);
//            if (randomNum==12); count12++;
//            if (randomNum==13); count13++;
//            y++;
//        }
//        System.out.println("count12 "+count12+" count13:"+count13);
//
//        int var1=0;
//        while (var1!=0){
//            System.out.println("while:var1 ne raven 0");
//        }
//        do {
//            System.out.println("do while: var1 ne raven 0");
//        } while (var1!=0);
//
//        System.out.println();
//        System.out.println("do while ****");
//
        Scanner scanner=new Scanner(System.in);
//        int answerInt;
//        do {
//            System.out.println("vvedite chislo menshe ili ravno 10");
//            answerInt = scanner.nextInt();
//            scanner.nextLine();
//            System.out.println("vy vveli chislo: " + answerInt);
//            System.out.println("test: "+(answerInt>10));
//
//        }  while (answerInt>10);
//        System.out.println("ura vashe chislo podhodit"+answerInt);

//        int counter=1;
//
//        while (counter <=5){
//            System.out.println(counter++);
////            counter=counter +1
//        }

//        int counter1=1;
//        while (counter1<=20){
//            if (counter1%2==0)
//            System.out.println(counter1);
//
//            counter1 ++;

//        }

//        int maxInt=Integer.MAX_VALUE;
//        int minInt=Integer.MIN_VALUE;
//        System.out.println("max "+maxInt);
//        System.out.println("min"+minInt);
//
//        System.out.println("max+1="+(maxInt+1));
//        System.out.println("min-1="+(minInt-1));

        Random random1=new Random();

        System.out.println("Vvedite chislo: ");
        int userInt= scanner.nextInt();

        int counter2=1;
        while (counter2<=userInt) {
            int randomInt= random1.nextInt(100)+1;
            counter2++;
        }
        System.out.println("cikl zavershen. kol-vo povtor: "+(counter2-1));
    }
}
