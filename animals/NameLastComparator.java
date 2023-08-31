package lesson33ComparableInterface.animals;

import java.util.Comparator;

public class NameLastComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        String animal1 = o1.getName();
        String animal2 = o2.getName();
        char lastLetter1 = animal1.charAt(animal1.length() - 1);
        char lastLetter2 = animal2.charAt(animal2.length() - 1);
        return Character.compare(lastLetter1, lastLetter2);
    }
}
