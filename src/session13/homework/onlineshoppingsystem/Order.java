package session13.homework.onlineshoppingsystem;

import java.util.Date;
import java.util.List;

public class Order {

    private int orderNumber;
    private Customer customer;
    private List<Product> products;
    private Date orderDate;
    private String orderStatus;

    private static int nextOrderNumber = 1;

    public Order(Customer customer, List<Product> products) {
        this.orderNumber = nextOrderNumber++;
        this.customer = customer;
        this.products = products;
        this.orderDate = new Date();
        this.orderStatus = "Pending"; // Default status
    }

    public double calculateTotalAmount() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public void updateOrderStatus(String status) {
        this.orderStatus = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order Number: ").append(orderNumber).append("\n");
        sb.append("Order Date: ").append(orderDate).append("\n");
        sb.append("Order Status: ").append(orderStatus).append("\n");
        sb.append("Customer: ").append(customer.getName()).append("\n");
        sb.append("Total Amount: $").append(calculateTotalAmount()).append("\n");
        sb.append("Products:\n");
        for (Product product : products) {
            sb.append("- ").append(product.getName()).append(": $").append(product.getPrice()).append("\n");
        }
        return sb.toString();
    }
}