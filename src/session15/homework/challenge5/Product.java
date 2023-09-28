package session15.homework.challenge5;

import java.util.Objects;

public class Product {

    private String name;
    private double price;
    private int id;

    public Product(String name, double price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public static void main(String[] args) {
        Product product1 = new Product("Paul", 13.44, 1);
        Product product2 = new Product("Paul", 13.44, 1);
        Product product3 = new Product("Joe", 13.44, 3);

        System.out.println(product1.equals(product2));
        System.out.println(product1.equals(product3));

        System.out.println(product1.hashCode());
        System.out.println(product2.hashCode());
        System.out.println(product3.hashCode());

        System.out.println("Should have the same hasCode1: " +
                (product1.hashCode() == product2.hashCode()));

        System.out.println("Should have the same hasCode2: " +
                (product1.hashCode() == product3.hashCode()));
    }
}