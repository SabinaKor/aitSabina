package mathem;

public class Integernum {
    public static void main(String[] args) {
        System.out.println("mathematics");
        int x = 20;
        int y = 10;

        int z = x - y; // = prisvoenie, a ne ravenstvo

        System.out.println(" z= x - y: " + z); // v kovychkah eto textovoe soprovozhdenie
        z = x * y;
        System.out.println(" z= x*y: " + z);
        int a = 57;
        int b = 10;

        // delenie celyh chisel
        int c = a / b;
        System.out.println("chastnoe " + a + "/" + b + "=" + c); //celochislennoe delenie

        int d = a % b;
        System.out.println("chastnoe " + a + "%" + b + "=" + d); //celochis delenie s ostatkom

        int n = 60 % 12; //ostatok ot deleniya
        System.out.println("60%12=" + n);

        System.out.println("======= veshestvennye chisla =======");

        double f = 10.0D;
        double g = 9.8;
        double e = f / g;
        System.out.println("result" + f + "/" + g + "=" + e);

        //formatirovannyi vyvod
        System.out.printf("result: %.2f",e);

        //preobrazovanie tipov
        int num1=10;
        int num2=3;

        double d1=(double)num1/ (double)num2; // preobraz tip int v tip double
        System.out.println();
        System.out.println(d1);

        int num3=(int) d1; //preobraz tipa
        System.out.println(num3);

        System.out.println("====metody klassa math.=====");

        double r=10;
        double length=2* Math.PI * r; //dlina okruzhnosti
        System.out.println("Length of circle is : "+length);

        double area = Math.PI *Math.pow(r, 2); //Pi*r v kvadrate (ploshad kruga)
        System.out.println("Area of circle is: "+area);

        System.out.println("=====inkrement i dekrement=====");
        int i =0;
        i++; //uvelichenie na 1
        System.out.println("i="+i);

        ++i; //uvelich na 1
        System.out.println("i="+i);

        //+=, -=, *=, /= - provesti exprimenty, chto poluchaetsya. pochitat stat'e


    }
}
