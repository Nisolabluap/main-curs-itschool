package session12.practice.compositionoverinheritance.inheritance;

public class Car extends Engine {

    @Override
    void start() {
        System.out.println("Car engine has stared.");
    }
}