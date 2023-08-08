
public class Arrays {
    public static void main(String[] args) {
        int[] array;
        //kakoi to code
        array=new int[5];
//        int array2[]; option 2, not recommend

//        int a;
//        a=10;
        int a=10;
        int[] array2=new int [10];//0
        int[] array3=new int[a];

        char[] chars=new char[5];

        String[] strings=new String[7]; //null
        String str=null;//default 0
        boolean[] booleans=new boolean[100]; //false


        String[] str1=new String[]{"one,two,regert"};


        int[] numberone=new int[5]; // 0,0,0,0,0
        int[] numbers =new int[]{1,5,-16,25,0};
        int[] numbers2={1,5,-16,25,0};

        int[] myArray={1, 5, -16, 25, 15845};

        int digitIndex1= myArray[2];
        System.out.println("digitIndex"+digitIndex1);
        myArray[1]=10;
        int digitIndex1new=myArray[1];
        System.out.println("new value:"+ digitIndex1new);

        int lengthArray=myArray.length;
        System.out.println("Array length: "+lengthArray);

        int counter=0;
        while (counter< myArray.length){
            if (myArray[counter]%2==0) {
                System.out.println("Chetnoe chislo iz massiva myArray" + myArray[counter]); //myArray[0] --myArray[length-1]
            }
            counter++;
        }
        System.out.println(java.util.Arrays.toString(myArray));


        System.out.println();

        int[] myArraySecond={55, -15, 543, 10, 17, 56, 101, 0, 145};
        int[] arraySubarray= java.util.Arrays.copyOf(myArraySecond, 4);
        System.out.println(java.util.Arrays.toString(arraySubarray));

        int[] arraySubarray2= java.util.Arrays.copyOfRange(myArraySecond, 4, 7);
        int[] arraySubarray3= java.util.Arrays.copyOfRange(myArraySecond, 4, 7);
        System.out.println("ArraySubarray2" +java.util.Arrays.toString(arraySubarray2));
        System.out.println("ArraysSubarray3"+java.util.Arrays.toString(arraySubarray3));

        System.out.println(arraySubarray2==arraySubarray3);
        System.out.println(java.util.Arrays.equals(arraySubarray2, arraySubarray3));

        System.out.println("myArraySecond: "+ java.util.Arrays.toString(myArraySecond));
        java.util.Arrays.sort(myArraySecond, 2,6);
        System.out.println("myArraySecond: "+ java.util.Arrays.toString(myArraySecond));

        java.util.Arrays.sort(myArraySecond);
        System.out.println("myArraySecond: "+ java.util.Arrays.toString(myArraySecond));














    }
}
