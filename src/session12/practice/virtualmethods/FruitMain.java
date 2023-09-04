package session12.practice.virtualmethods;

public class FruitMain {

    public static void main(String[] args) {
        printFruitDetails(new Apple());
        printFruitDetails(new Orange());
    }

    public static void printFruitDetails(Fruit fruit) {
        System.out.println("Taste: " + fruit.taste() + ", colour: " + fruit.colour());
    }
}