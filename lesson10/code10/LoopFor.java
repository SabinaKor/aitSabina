public class LoopFor {
    public static void main(String[] args){
        /*
        for ([nachalnye znacheniya]) ; [uslovie]; [izmenenie sschetchika]{
        }
         */
        int j=0;
        while (j<10) {
            System.out.print(j +" ");
            j++;
        }
        System.out.println();
        System.out.println("End while loop");


         for (int i=0; i<10; i++) {
             System.out.print(i+ " ");
         }
        System.out.println();
        System.out.println("End for loop");

        for (int i=0; i<=100 ;i=i+5 ) {
            System.out.println(i);
        }
        /*
        vyvesti vse chisla ot 10 do 0
         */
        int i;
        i=14;
        for (int a=0; i>=0; i--, a++){
            System.out.print(i+ ":" + a);
        }
        System.out.println();

        int[] array= {5,10,43,545,-10,-23,0,15};
        for (int k=0; k< array.length; k++){
        System.out.print(array[k]+" ");
        }
        System.out.println();

        /*
        Vyvesti na ekran vse chisla ot 5 do 20
         */
        for (int ch=5; ch<=20; ch++) {
            System.out.print(ch+ " ");
        }
        System.out.println();

        int forSearch=545; //vyvesti na ekran index elimenta po zadannomu znacheniu
        int index=-1;
        for (int k=0; k< array.length; k++){
            if (array[k]==forSearch) {
                index=k;
                System.out.println("sovpadie naideno");
                if (index==3){
                    continue; //break
                }
                System.out.println("else");
            } else {
                System.out.println("chislo "+array[k]+ " ne ravno "+ forSearch);
            }
        }
        System.out.println(index);
        System.out.println();
        System.out.println("++++++++");

        //raspechatat 10 raz ciary ot 0 do 4
      for (int k=0; k<10; k++) {
            System.out.print(k+ ":");
            for (int l=0; l<5; l++){
                System.out.print("test");
                if (k==3) continue;
                System.out.print(l+ " ");
            }
            System.out.println();
        }
    }
}
