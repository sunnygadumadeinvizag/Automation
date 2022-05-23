package HT4_Consumersupplier;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.function.BiConsumer;

import preconditions.*;

public class ConsumeProduct {

    static String filepath = System.getProperty("user.dir") + "/productsfile.txt";

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<Product>();

        products.add(new Product("Dell Inspiron Laptop", 85000, "Electronics", "A1"));
        products.add(new Product("Wipro LED", 80, "Electronics", "A"));
        products.add(new Product("Damro Workstation", 30000, "Furniture", "B"));
        products.add(new Product("Anchor Junction Box", 1000, "Electronics", "A1"));
        products.add(new Product("Laptop Heat Pad", 500, "Misc Accessories", "B"));
        products.add(new Product("Beats Headset", 5000, "Electronics", "A1"));
        products.add(new Product("Samsung Mobile", 25000, "Electronics", "A"));


        BiConsumer<ArrayList<Product>, String> consumeProd = (prod, params) -> {
            for (Product prd : prod) {
                if (params.equals("FILE"))
                    writeToFile(prd.toString());
                else if (params.equals("CONSOLE"))
                    System.out.println(prd.toString());
            }
        };

        consumeProd.accept(products, "FILE");
        consumeProd.accept(products, "CONSOLE");

    }

    public static void writeToFile(String value) {
        try {
            FileWriter myWriter = new FileWriter(filepath, true);
            myWriter.write(value);
            myWriter.write("\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
