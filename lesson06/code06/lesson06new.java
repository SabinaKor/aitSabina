import java.util.Random;
import java.util.Scanner;

public class lesson06new {
    public static void main(String[] args) {
       /* int x=18;
       // if(x<=10) System.out.println("privet");

        if(x==10) {
            x=x-1;
            System.out.println("x in if: "+x);
        }
        System.out.println("x after if:"+x);

        */

         Scanner scanner =new Scanner(System.in);

        System.out.println("Vvedite chto-nibud : ");
        int temp= 3;

        System.out.println("Vvedite chislo 1");
        String stringInput = scanner.nextLine();
        System.out.println("string-" +stringInput+1000);

        int parseInt= Integer.parseInt(stringInput);
        System.out.println(parseInt+1000);
        int userInputInt=scanner.nextInt();
        if(userInputInt==1) {
            System.out.println("Vy vvely chisli 1: ");

        } else if (userInputInt==3){
            System.out.println("Vy zhe vveli 3, a ne 1:");
        }
        else if (userInputInt==3&&temp !=3){
            System.out.println("Vy zhe vveli 3, i temp=3:");
        }
          else if(userInputInt==5) {
            System.out.println("Vy vveli chislo 5");
        }
          else {
            System.out.println("Vy vveli chto-to neponyatnoe");
        }

        System.out.println("Vyshli iz operatora if:");


        {
            /*
            rebenok poluchil ocenku v shkole. ot 1 do 5.
            u rebenka est karmannye dengi
            za horoshie ocenki poluchaet dengi, za plohie otbiraut
            5
             */
            Random random=new Random();
            int money =100;
            int note = random.nextInt(5);


            System.out.println("Ocenka: " + note);

            if (note==5) {
                money+=20;
            } else if (note==4) {
                money += 10;
            } else if (note ==3) {

            } else if (note==2) {
                money -=20; //money=money -20;
            } else if (note==1) {
                money=0;
            } else  {
                System.out.println("Polucheno nekorrektnaya ocenka!");
            }

            System.out.println("U rabenka ostalos:"+money+" monet");
        }

        int var1=10;
        int var2=var1==10?20:var1-4;
        System.out.println((var1==0)?"ravno 0:" :"ne ravno 0");
        System.out.println("var2 "+var2);

        if (var1>10) {
            var2=20;
        } else {
            var2=0;
        }

    }
}
