package session6.practice;

public class StringPractice {

    public static void main(String[] args) {
        String animal1 = "lion";
        String animal2 = new String("lion");
        String animal3 = "lion";

        System.out.println(animal1 == animal2);
        System.out.println(animal1.equals(animal2));
        Integer.toHexString(System.identityHashCode(animal1));
        Integer.toHexString(System.identityHashCode(animal2));
        Integer.toHexString(System.identityHashCode(animal3));

        System.out.println("Hash code for animal1: " + System.identityHashCode(animal1));
        System.out.println("Hash code for animal2: " + System.identityHashCode(animal2));
        System.out.println("Hash code for animal3: " + System.identityHashCode(animal3));
        garbageCollectorExample();
    }

    public static void garbageCollectorExample() {
        String name = "Paul";
        System.out.println(name);

        name = "Ion";
        System.out.println(name);
    }
}
