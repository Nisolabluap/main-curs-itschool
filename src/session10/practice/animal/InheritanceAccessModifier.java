package session10.practice.animal;

public class InheritanceAccessModifier {

}

class Athlete {

    protected int age;

    protected void setAge(int age) {
        this.age = age;
    }
}

class Runner extends Athlete {

    private int age;

}

class Biker extends Athlete {

}