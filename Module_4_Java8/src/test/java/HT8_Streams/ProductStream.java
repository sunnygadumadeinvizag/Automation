package HT8_Streams;

import java.util.ArrayList;

import preconditions.Product;

public class ProductStream {

    private static void productsWithCostMoreThan1000(ArrayList<Product> prod) {
        System.out.println("Products with Cost More than 1000 are: ");
        prod.stream().filter((p) -> p.getPrice() > 1000).forEach((p) -> System.out.println(p.getName()));

    }

    private static void productsWithCategoryElectronics(ArrayList<Product> prod) {
        System.out.println();
        System.out.println("Products with Category as Electronics are: ");
        prod.stream().filter((p) -> p.getCategory().equalsIgnoreCase("Electronics"))
                .forEach((p) -> System.out.println(p.getName()));

    }

    private static void productsWithCategoryElectronicsCostingMoreThan1000(ArrayList<Product> prod) {
        System.out.println();
        System.out.println("Products with Category as Electronics and worth more than 1000 are: ");
        prod.stream().filter(p -> p.getCategory().equalsIgnoreCase("Electronics")).filter(i -> i.getPrice() > 1000)
                .map(j -> j.getName().toUpperCase()).forEach((p) -> System.out.println(p));

    }

    private static void countOfElectronicProducts(ArrayList<Product> prod) {
        System.out.println();
        System.out.println("Number of Products with Category as Electronics are: "
                + prod.stream().filter((p) -> p.getCategory().equalsIgnoreCase("Electronics")).count());

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


        productsWithCostMoreThan1000(prod);


        productsWithCategoryElectronics(prod);


        productsWithCategoryElectronicsCostingMoreThan1000(prod);


        countOfElectronicProducts(prod);

    }

}
