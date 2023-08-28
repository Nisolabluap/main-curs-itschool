package session10.practice.homeworkpractice;

public class AnimalMain {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal("Generic Animal");
        Mammal dog = new Mammal("Dog");
        Bird sparrow = new Bird("Sparrow");
        Fish goldfish = new Fish("Goldfish");

        genericAnimal.eat();
        dog.eat();
        sparrow.eat();
        goldfish.eat();
    }
}