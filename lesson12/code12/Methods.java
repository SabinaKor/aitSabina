import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        //  powMethod(3);
//       int resultfromMethod= 10;
//       resultfromMethod=10+5;

        int resultfromMethod = powIntMethod(3);
        System.out.println(resultfromMethod);
        //  int resultfromMethod= powIntMethod(3);

        //napishite method prinimaushii na vhod chislo
        // i vozvrashaushego kvadrat etgo chisla
        int resultFromKvadrat = printKvadrat(5);
        System.out.println(resultFromKvadrat);
        System.out.println(printKvadrat(3));

        double doubleKvadrat = printKvadrat(2.5);
        System.out.println(doubleKvadrat);
        System.out.println(printKvadrat(4.0));


        System.out.println(powIntMethod(-1));
        System.out.println("___MIN____");
        int[] array = {1, 4, 5, 0, 8};
        System.out.println(Arrays.toString(array));
        int minInArray = foundMinInArray(array);
        System.out.println("min in array: " + minInArray);
    }

    public static double printKvadrat(double x) {
        return x * x;
//        int result=x*x;
//        return result;
    }

    public static int printKvadrat(int e) {
        int result = e * e;
        return result;
        // return e*e; eto to zhe samoe

    }
    public static int foundMinInArray(int[] arr) {
        if (arr != null) {
            int min = arr[0];
            for (int value : arr) {
                if (value < min) {
                    min = value;
                }
            }
            return min;
        } else {
            //prishel null
            //chto vozvrashat?
            return -1;
        }
    }
    public static void powMethod(int x){
        if (x >= 0) {
            int result = 1;
            for (int i = 0; i < x; i++) {
                result = result * 2;
            }
            System.out.println("2 в степени " + x + " равно: " + result);
        } else {
            System.out.println("Не верные аргументы вызова метода");
        }
    }
    public static int powIntMethod(int x){
        int result = 1;
        if (x >= 0) {
            for (int i = 0; i < x; i++) {
                result *= 2;
            }
        } else {
            System.out.println(Math.pow(2, x));
            result = (int) Math.pow(2, x);
        }
        System.out.println(result);
        return result;
    }
}
