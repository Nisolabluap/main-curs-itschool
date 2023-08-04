package session3.homework;

public class ZeroToHeroChallenge13 {

    public static void main(String[] args) {
        //13. Write a program to calculate the price after discount. Take the original price and discount percentage as input. Use compound assignment operator to perform the calculation.
        double myPrice = (double) (Math.random() * 1000) + 100;
        double myDiscount = (double) (Math.random() * 70) + 5;

        double myDiscountedPrice = myPrice - (myPrice * (myDiscount / 100));

        System.out.println("\nMy discounted price is: " + (String.format("%.2f", myDiscountedPrice)) + " RON\n" + "Original price is: " + (String.format("%.2f", myPrice)) + " RON\n" + "Discount: " + (String.format("%.2f", myDiscount)) + " %");
    }
}