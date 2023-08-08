import java.util.Random;

public class Homework05 {
    public static void main(String[] args) {
        /*
        Создайте 10 переменных типа int.
Присвойте каждой случайное значение от 0 до 20
Для каждой переменной выведите строку в формате:
Число: 6 четное: true, кратно 3: true, четное и кратное 3: true
Число: 3 четное: false, кратно 3: true, четное и кратное 3: false
(опционально) - учесть, что случайное число может оказаться 0
         */
        Random  random = new Random();
        int randomNum= random.nextInt(20);
        System.out.println("randomNum: "+randomNum);

        boolean a=(randomNum %2==0);
        System.out.println("Num: "+ randomNum+ " even:"+a);
        boolean b=(randomNum %3==0);
        System.out.println("Num: "+ randomNum+ " even:"+b);
        boolean c=(a)& (b);
        System.out.println("Num: "+randomNum+ ", chetnoe: "+a+ ", kratno 3: "+b+", chetnoe i kratnoe 3: "+c);
        int randomNum1=random.nextInt(20);
        System.out.println("Num: "+randomNum1+ ", chetnoe: "+a+ ", kratno 3: "+b+", chetnoe i kratnoe 3: "+c);
        int randomNum2=random.nextInt(20);
        System.out.println("Num: "+randomNum2+ ", chetnoe: "+a+ ", kratno 3: "+b+", chetnoe i kratnoe 3: "+c);
        int randomNum3=random.nextInt(20);
        System.out.println("Num: "+randomNum3+ ", chetnoe: "+a+ ", kratno 3: "+b+", chetnoe i kratnoe 3: "+c);
        int randomNum4=random.nextInt(20);
        System.out.println("Num: "+randomNum4+ ", chetnoe: "+a+ ", kratno 3: "+b+", chetnoe i kratnoe 3: "+c);
        int randomNum5=random.nextInt(20);
        System.out.println("Num: "+randomNum5+ ", chetnoe: "+a+ ", kratno 3: "+b+", chetnoe i kratnoe 3: "+c);
        int randomNum6=random.nextInt(20);
        System.out.println("Num: "+randomNum6+ ", chetnoe: "+a+ ", kratno 3: "+b+", chetnoe i kratnoe 3: "+c);
        int randomNum7=random.nextInt(20);
        System.out.println("Num: "+randomNum7+ ", chetnoe: "+a+ ", kratno 3: "+b+", chetnoe i kratnoe 3: "+c);
        int randomNum8=random.nextInt(20);
        System.out.println("Num: "+randomNum8+ ", chetnoe: "+a+ ", kratno 3: "+b+", chetnoe i kratnoe 3: "+c);
        int randomNum9=random.nextInt(20);
        System.out.println("Num: "+randomNum9+ ", chetnoe: "+a+ ", kratno 3: "+b+", chetnoe i kratnoe 3: "+c);

        /*
        ask 01 со звездочкой Построчно сократить логическое выражения (соблюдая приоритетность операций)
        System.out.println((true | false) | (45 < 70) & !(true) ^ (6 == 5));
         Пример выполнения:

        System.out.println(true || false ^ true && !true);
        System.out.println(true || false ^ true && false);
        System.out.println(true || true && false);
        System.out.println(true || false);
        System.out.println(true);
        Убедиться, что во всех выведенных строчках выводится одинаковое значение типа boolean
         */
        /*
        !
        &
        ^
        |
        &&
        ||
         */
        boolean bb=45<70;
        boolean cc=6==5;
        System.out.println("bb: "+bb);
        System.out.println("cc: "+cc);

        System.out.println((true | false) | (45 < 70) & !(true) ^ (6 == 5));
        System.out.println((true | false) | true ^ (6 == 5));
        System.out.println((true | false) | true ^false );
        System.out.println((true | false) | true);
        System.out.println(true | true);
        System.out.println(true);






    }

}
