package session13.homework.onlineshoppingsystem;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public List<Product> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(List<Product> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public List<Order> getOrderHistory() {
        return orderHistory;
    }

    public void setOrderHistory(List<Order> orderHistory) {
        this.orderHistory = orderHistory;
    }

    private String name;
    private String email;
    private String shippingAddress;
    private String billingAddress;
    private List<Product> shoppingCart;
    private List<Order> orderHistory;

    public Customer(String name, String email, String shippingAddress, String billingAddress) {
        this.name = name;
        this.email = email;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
        this.shoppingCart = new ArrayList<>();
        this.orderHistory = new ArrayList<>();
    }

    public void addToCart(Product product) {
        shoppingCart.add(product);
    }

    public void removeFromCart(Product product) {
        shoppingCart.remove(product);
    }

    public void placeOrder() {
        Order order = new Order(this, new ArrayList<>(shoppingCart));
        orderHistory.add(order);
        shoppingCart.clear();
    }

    public List<Order> viewOrderHistory() {
        return orderHistory;
    }

    public void trackOrderStatus(Order order) {
    }
}