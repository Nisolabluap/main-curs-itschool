package session12.practice.compositionoverinheritance.composition;

public class CompositionMain {

    public static void main(String[] args) {
        Engine carEngine = new Engine();
        Car car = new Car(carEngine);
        car.start();
    }
}