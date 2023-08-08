public class Lesson16 {
    public static void main(String[] args) {
        Cat cat=new Cat();

        cat.sayMeow();
        System.out.println(cat.age);
        cat.running();

        Cat cat1= new Cat(5);
        System.out.println(cat1.age);
        System.out.println(cat1.name);

        Cat cat2=new Cat(3,"Max");
        cat2.sayMeow();
        cat2.running();
        System.out.println("name:" +cat2.name);
        System.out.println("age: "+cat2.age);

        System.out.println("________");

        Cat catBoris=new Cat(5,"Boris", "red");
        catBoris.sleep();
        System.out.println("name:"+catBoris.name);
        System.out.println("Age: "+catBoris.age);
        System.out.println("Color: "+catBoris.color);
    }
}
