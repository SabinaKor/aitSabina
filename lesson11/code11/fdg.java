import java.util.Arrays;

public class fdg {
    public static void main(String[] args) {
        int[] myArray2 = {55, -15, 543, 10, 17, 56, 101, 0, 145};
        int[] arraySubarray = Arrays.copyOf(myArray2,4);
        int[] copyOfArray = Arrays.copyOf(myArray2, myArray2.length);
        System.out.println(Arrays.toString(arraySubarray));

        int[] arraySubarray2 = Arrays.copyOfRange(myArray2, 4, 7);
        int[] arraySubarray3 = Arrays.copyOfRange(myArray2, 4, 7);
        int[] arraySubarray4 = Arrays.copyOfRange(myArray2, 4, 100); // [17, 56, 101, 0, 145, 0, 0, 0, 0 ... 0] -> new int[100 - 4]
        System.out.println("arraySubarray2 " + Arrays.toString(arraySubarray2) );
        System.out.println("arraySubarray3 " + Arrays.toString(arraySubarray3));
        System.out.println(arraySubarray4.length);

        System.out.println(arraySubarray2 == arraySubarray3);
        System.out.println(Arrays.equals(arraySubarray2, arraySubarray3));


        System.out.println("myArray2 " + Arrays.toString(myArray2));
        Arrays.sort(myArray2, 2, 6);

        System.out.println("myArray2 " + Arrays.toString(myArray2));
        Arrays.sort(myArray2);
        System.out.println("myArray2 " + Arrays.toString(myArray2));

        System.out.println("copyOfArray: " + Arrays.toString(copyOfArray));

    }
}
