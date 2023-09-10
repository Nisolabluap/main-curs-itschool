package session13.homework.onlineshoppingsystem;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product("Product 1", "Description 1", 19.99, 10);
        Product product2 = new Product("Product 2", "Description 2", 29.99, 5);

        Customer customer = new Customer("Customer Name", "customer@email.com", "Shipping Address", "Billing Address");

        customer.addToCart(product1);
        customer.addToCart(product2);

        customer.placeOrder();

        System.out.println("Order History:");
        for (Order order : customer.viewOrderHistory()) {
            System.out.println(order);
        }
    }
}
