package java8.PredicatesAssignment;


import java.util.ArrayList;
import java.util.function.Predicate;

public class ProductClass {
    String name;
    int price;
    String category;
    String grade;

    public ProductClass(String name, int price, String category, String grade) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "ProductClass{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<java8.PredicatesAssignment.ProductClass> productClassList = new ArrayList<>();

        productClassList.add(new java8.PredicatesAssignment.ProductClass("Led", 2000, "Electornics", "A"));
        productClassList.add(new java8.PredicatesAssignment.ProductClass("Fan", 50, "Electrical", "B"));
        productClassList.add(new java8.PredicatesAssignment.ProductClass("Lithium", 3000, "Battery", "C"));
        productClassList.add(new java8.PredicatesAssignment.ProductClass("Smartphone", 900, "Mobile", "D"));
        productClassList.add(new java8.PredicatesAssignment.ProductClass("Refrigrator", 2000, "Electornics", "E"));
        productClassList.add(new java8.PredicatesAssignment.ProductClass("tv", 70, "Electornics", "E"));


        Predicate<java8.PredicatesAssignment.ProductClass> pricePredicateGreaterThan1000 = a -> a.price > 1000;
        Predicate<java8.PredicatesAssignment.ProductClass> categoryPredicateElectronics = a -> a.category.equals("Electornics");
        Predicate<java8.PredicatesAssignment.ProductClass> pricePredicateGreaterThan100 = a -> a.price > 100;

        System.out.println("products with price > 1000/-");
        productClassList.stream().filter(pricePredicateGreaterThan1000).forEach(System.out::println);


        System.out.println("products from electronics category.");
        productClassList.stream().filter(categoryPredicateElectronics).forEach(System.out::println);


        System.out.println("products with price> 100/- and from electronics category");
        productClassList.stream().filter(pricePredicateGreaterThan100.and(categoryPredicateElectronics)).forEach(System.out::println);

        System.out.println("product price is greaterthan 100/- or product is in electronics");
        productClassList.stream().filter(pricePredicateGreaterThan100.or(categoryPredicateElectronics)).forEach(System.out::println);


        System.out.println("product if the product price is lessthan 100/- and product is in electronics category");
        productClassList.stream().filter(pricePredicateGreaterThan100.negate().and(categoryPredicateElectronics)).forEach(System.out::println);

    }
}
