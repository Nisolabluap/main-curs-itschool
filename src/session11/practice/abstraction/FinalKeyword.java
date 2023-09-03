package session11.practice.abstraction;

public class FinalKeyword {


}

class Parent {

    final void showMessage() {
        System.out.println("Show me this message.");
    }
}

class Child extends Parent {

    //we can't override this method due to final keyword.
    void showMessege() {

    }
}