package lesson33ComparableInterface.animals;

public class Animal {
    /*
    Создать класс Animal c полями name, weight, color.
    Используя компараторы вывести на экран список животных, упорядоченный по:
    1. имени
    2. по весу
    3. список имен животных, упорядоченный по возрастанию последней буквы имени
    Wolf, Bear, Fox, Elephant, Anakonda
    для 1 пункта:
    name Anakonda , weight 500, color yellow
    ---------
    -----
    для 3 пункта:
    Anakonda
    Wolf
    Bear
    Elephant
    Fox
    Протестировать правильность работы компараторов
     */
    private String name;
    private int weight;
    private String color;

    public Animal(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return name + " " + weight + "kg " + color;
    }

}
