public class Book {
    String title;
    String author;
    Double price;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    public Book(String title, String author, Double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public void updatePrice(double newPrice) {
        if(newPrice < 0){
            throw new IllegalArgumentException("Price cannot be negative");
        }else {
            price = newPrice;
        }
    }

    public void applyDiscount(double discountPer) {
        if(discountPer > 0.00 && discountPer < 100.0){
            this.price = price - (price * (discountPer / 100));
            System.out.println(discountPer + "% Discount applied & Updated Price :) ");
        }else{
            System.out.println("Invalid Discount Percentage No Change to the Price :( ");
        }
    }

}

