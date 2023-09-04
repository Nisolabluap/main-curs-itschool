package session12.practice.virtualmethods;

public class Orange extends Fruit {

    @Override
    public String taste() {
        return "orange is sweet";
    }

    @Override
    public String colour() {
        return "orange is orange";
    }
}