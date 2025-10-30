import java.util.*;
import java.util.stream.*;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return name + " " + price;
    }
}

public class ProductStreamOps {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Pen", 15),
            new Product("Book", 120),
            new Product("Bag", 500),
            new Product("Pencil", 10)
        );

        // Find products > 20, map to name, sort
        products.stream()
            .filter(p -> p.price > 20)
            .map(p -> p.name)
            .sorted()
            .forEach(System.out::println);

        // Sum of all product prices
        double total = products.stream()
            .mapToDouble(p -> p.price)
            .sum();
        System.out.println("Total price: " + total);
    }
}
