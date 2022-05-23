package HT4_Consumersupplier;

import java.util.ArrayList;
import java.util.function.Consumer;

import preconditions.Product;

public class ConsumerToPrintPremiumGradeProductWithSuffix {

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<Product>();

        products.add(new Product("Dell Inspiron Laptop", 85000, "Electronics", "A1"));
        products.add(new Product("Wipro LED", 80, "Electronics", "A"));
        products.add(new Product("Damro Workstation", 30000, "Furniture", "B"));
        products.add(new Product("Anchor Junction Box", 1000, "Electronics", "A1"));
        products.add(new Product("Laptop Heat Pad", 500, "Misc Accessories", "B"));
        products.add(new Product("Beats Headset", 5000, "Electronics", "A1"));
        products.add(new Product("Samsung Mobile", 25000, "Electronics", "A"));

        // Print all the Premium grade products with name suffixed with '*'.

        Consumer<ArrayList<Product>> printProd = (prod) -> {
            for (Product pr : prod) {
                if (pr.getGrade().equalsIgnoreCase("Premium") && pr.getName().endsWith("*"))
                    System.out.println(pr.toString());

            }
        };

        printProd.accept(products);

    }

}
