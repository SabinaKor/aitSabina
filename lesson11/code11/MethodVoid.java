import java.util.Arrays;
import java.util.Random;

public class MethodVoid {
    public static void main(String[] args) {
        sayHello();
        sayHello();

        char chSymbol='A';
        System.out.println((int)chSymbol);
        printDecimalCodeOfChar('A');
//        printDecimalCodeOfChar(chSymbol); tak tozhe mozhno

        int[] arrays={44, 54, 13, 66, 35,21};
        System.out.println("Arrays print: "+Arrays.toString(arrays));
        System.out.print("my method: ");
        printArray(arrays);

        // napisat method prinimaushii chislo. vyvesti na ekran nadpis:
        //yavlyaetsya li chislo prostym
        int[] array={45,66,77,42,89};
        for (int i=0; i< array.length; i++){
            printIsDigitSimple(array[i]);
        }

        for (int element:array){
            printIsDigitSimple(element);
        }
        System.out.println("for each loop String +++");
        String[] strings={"ghghgh", "hjhjhjhj"};
        for (String str:strings){
            System.out.println(str);
        }
//      method vyvodyashii na ekran chisla ot 1 do n.
        // chislo n method dolzhen prnimat v parametry
        printNumbers(10);
        printNumbers(3,10);

    }
    //methods area
    public static void printNumbers(int x, int y){
        for (int i=x; i<=y;i++){
            System.out.print(i+ " ");
        }

    }
    public static void printNumbers(int n){
        printNumbers(1,n);
//        for (int i=1; i<=n;i++){
//            System.out.print(i+ " ");
        System.out.println();
    }


        public static void printIsDigitSimple(int number){
            boolean isPrime = true;
            if (number == 1||number<=0) {
                isPrime=false;
                System.out.println("Число равно 1 ne yavlyaetsya prostym- " );
            }
            for (int j = 2; j < number; j++) { // 9 -> [2, 3, 4, 5, 6, 7, 8]
                if (number % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(number + "prostoe ");
            }else {
                System.out.println(number+"ne prostoe");
        }

    }
    public static void printArray(int[] array){
        System.out.print("[");
        for (int i=0; i< array.length; i++){
            System.out.print(array[i]+ ((i== array.length-1)? "": ", "));
        }
        System.out.print("]");
        System.out.println();
    }

    public static void sayHello(){
        System.out.println("Hello");
    }


    public static void printDecimalCodeOfChar(char charName){
        System.out.println((int)charName);
    }
}
