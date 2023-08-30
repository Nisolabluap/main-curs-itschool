package session10.homework.animal;

public class TestAnimal {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();

        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        Wolf wolf = new Wolf();
        wolf.sound();
    }
}