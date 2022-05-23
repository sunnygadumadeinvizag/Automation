package HT4_Consumersupplier;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Supplier;

import preconditions.Product;

public class SupplierToProvideRandomProd {

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<Product>();
        products.add(new Product("Dell Laptop", 50000, "Electronics", "A"));
        products.add(new Product("Dell Mouse", 500, "Electronics", "B"));
        products.add(new Product("HP Laptop", 100000, "Electronics", "A"));
        products.add(new Product("Lap Top Table", 999, "Accessories", "B"));
        products.add(new Product("Office Chair", 4000, "Accessories", "B"));
        products.add(new Product("Head set", 300, "Accessories", "B"));
        products.add(new Product("LEB bulb", 99, "Electronics", "B"));


        Supplier<Product> prodSup = () -> {
            return products.get((new Random()).nextInt(products.size()));

        };

        System.out.println(prodSup.get());
    }

}
