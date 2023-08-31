package lesson33ComparableInterface.animals;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal animal1=new Animal("Wolf",30,"Gray");
        Animal animal2=new Animal("Bear",150,"Brown");
        Animal animal3=new Animal("Fox",10,"Orange");
        Animal animal4=new Animal("Elephant",5000,"Gray");
        Animal animal5=new Animal("Anaconda",200,"Green");

        Animal[] animals={animal1,animal2,animal3,animal4,animal5};
        System.out.println(Arrays.toString(animals));
        Arrays.sort(animals,new AnimalNameComparator());
        System.out.println(Arrays.toString(animals));
        Arrays.sort(animals,new AnimalWeightComparator());
        System.out.println(Arrays.toString(animals));
        Arrays.sort(animals,new NameLastComparator());
        System.out.println(Arrays.toString(animals));

    }
}
