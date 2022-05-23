package HT8_Streams.HT3_FunctionalInterface;

import java.util.ArrayList;
import java.util.function.Function;

import preconditions.Product;

public class ProductFunction {

    /**
     * Method to display the total cost of the Products in the List
     *
     * @param prod
     * @author Lakshmimanasa_Katakam
     */
    private static void costOfAllProducts(ArrayList<Product> prod) {

        Function<ArrayList<Product>, Integer> func = i -> {
            int cost = 0;
            for (Product p : prod) {
                cost = cost + p.getPrice();
            }
            return cost;

        };

        System.out.println("The total cost of the Product in the list is: " + func.apply(prod));

    }

    /**
     * Method to display the total cost of the Products in the List whose cost id >
     * 1000
     *
     * @param prod
     * @author Lakshmimanasa_Katakam
     */
    private static void costOfAllProductsWithCostMoreThan1000(ArrayList<Product> prod) {

        Function<ArrayList<Product>, Integer> func = i -> {
            int cost = 0;
            for (Product p : prod) {
                if (p.getPrice() > 1000) {
                    cost = cost + p.getPrice();
                } else {
                    continue;
                }
            }
            return cost;

        };

        System.out.println("The total cost of the Product in the list with cost >1000: " + func.apply(prod));

    }

    /**
     * Method to display the total cost of the Products in the List which are
     * Electronics
     *
     * @param prod
     * @author Lakshmimanasa_Katakam
     */
    private static void costOfAllProductsWichAreElectronics(ArrayList<Product> prod) {

        Function<ArrayList<Product>, Integer> func = i -> {
            int cost = 0;
            for (Product p : prod) {
                if (p.getCategory().equalsIgnoreCase("Electronics")) {
                    cost = cost + p.getPrice();
                } else {
                    continue;
                }
            }
            return cost;

        };

        System.out.println("The total cost of the Product in the list whic are Electronics: " + func.apply(prod));

    }

    /**
     * Method to display the total cost of the Products in the List which are
     * Electronics and price > 1000
     *
     * @param prod
     * @author Lakshmimanasa_Katakam
     */
    private static void costOfAllProductsWhichAreElectronicsWithPriceMoreThan1000(ArrayList<Product> prod) {

        Function<ArrayList<Product>, Integer> func = i -> {
            int cost = 0;
            for (Product p : prod) {
                if (p.getCategory().equalsIgnoreCase("Electronics") && p.getPrice() > 1000) {
                    cost = cost + p.getPrice();
                } else {
                    continue;
                }
            }
            return cost;

        };

        System.out.println("The total cost of the Product in the list which are Electronics and Price more than 1000: "
                + func.apply(prod));

    }

    public static void main(String[] args) {
        ArrayList<Product> prod = new ArrayList<>();

        prod.add(new Product("Dell Inspiron Laptop", 85000, "Electronics", "A1"));
        prod.add(new Product("Wipro LED", 80, "Electronics", "A"));
        prod.add(new Product("Damro Workstation", 30000, "Furniture", "B"));
        prod.add(new Product("Anchor Junction Box", 1000, "Electronics", "A1"));
        prod.add(new Product("Laptop Heat Pad", 500, "Misc Accessories", "B"));
        prod.add(new Product("Beats Headset", 5000, "Electronics", "A1"));
        prod.add(new Product("Samsung Mobile", 25000, "Electronics", "A"));

        // Task-1
        costOfAllProducts(prod);

        // Task-2
        costOfAllProductsWithCostMoreThan1000(prod);

        // Task-3
        costOfAllProductsWichAreElectronics(prod);

        // Task-4
        costOfAllProductsWhichAreElectronicsWithPriceMoreThan1000(prod);

    }

}
