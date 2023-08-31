package lesson33ComparableInterface.animals;

import java.util.Comparator;

public class AnimalWeightComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
       return Integer.compare(o1.getWeight(),o2.getWeight());
    }
}
