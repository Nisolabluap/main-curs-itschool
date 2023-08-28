package session10.practice.homeworkpractice;

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("The animal is eating.");
    }
}

class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("The mammal is eating plants or other animals.");
    }
}

class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("The bird is eating seeds or insects.");
    }
}

class Fish extends Animal {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("The fish is eating plankton.");
    }
}