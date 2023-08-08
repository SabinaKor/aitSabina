package mathem;

public class homework03 {
    public static void main(String[] args) {
        int a =0;
        int b=1;
        int c=2;
        int d=3;
        int e=4;
        int f=5;
        int g=6;
        int h=7;
        int i=8;
        int j=9;
        int k=(a+b+c+d+e+f+g+h+i+j)/10;

        System.out.println("srednee arif chislo:" +k);

        int A=1000;
        int B=500;
        double C=(A+B)*0.1;
        System.out.println("Summa skidki:"+ C);
        double D=(A+B)-C;
        System.out.println("Summa so skidkoi:" + D);

        int Mon=30;
        int Tue=35;
        int Wed=28;
        int Thu=25;
        int Fri=28;
        int Sat=35;
        int Sun=25;
        int W=(Mon+Tue+Wed+Thu+Fri+Sat+Sun)/7;
        System.out.println("Srednyaya temperatura za nedelu:"+ W);

        int n=4%2, m=5%2, o=6%2;
        System.out.println("Primery ostatkov ot deleniya na 2:" +n+","+m+","+o);

        int p=7%3, r=33%3, s=65%3;
        System.out.println("Primery ostatkov ot deleniya na 3:"+p+","+r+","+s);

        int x=3;
        x+=x++;
        System.out.println(x);






    }
}
