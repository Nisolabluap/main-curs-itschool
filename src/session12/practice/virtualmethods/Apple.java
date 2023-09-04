package session12.practice.virtualmethods;

public class Apple extends Fruit {

    @Override
    public String taste() {
        return "apples is sweet";
    }

    @Override
    public String colour() {
        return "apples is red";
    }
}