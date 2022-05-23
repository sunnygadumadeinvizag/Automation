package HT4_Consumersupplier;

import java.util.ArrayList;
import java.util.function.Consumer;

import preconditions.Product;

public class ConsumerToUpdateGrade {

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<Product>();

        products.add(new Product("Dell Inspiron Laptop", 85000, "Electronics", "A1"));
        products.add(new Product("Wipro LED", 80, "Electronics", "A"));
        products.add(new Product("Damro Workstation", 30000, "Furniture", "B"));
        products.add(new Product("Anchor Junction Box", 1000, "Electronics", "A1"));
        products.add(new Product("Laptop Heat Pad", 500, "Misc Accessories", "B"));
        products.add(new Product("Beats Headset", 5000, "Electronics", "A1"));
        products.add(new Product("Samsung Mobile", 25000, "Electronics", "A"));

        Consumer<ArrayList<Product>> updateGrade = (prod) -> {
            for (Product pr : prod) {
                if (pr.getPrice() > 1000)
                    pr.setGrade("Premium");
            }

            System.out.println(prod.toString());

        };

        updateGrade.accept(products);

    }

}
