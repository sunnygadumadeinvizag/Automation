package HT5_BiFunction;

import preconditions.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class ProductBiFunction {

    public static void main(String[] args) {

        BiFunction<String, Integer, Product> func = (productName, price) -> new Product(productName, price);

        Product product = func.apply("sanitizer", 100);

        Product product1 = func.apply("Bread", 40);

        Product product2 = func.apply("eggs", 60);

        Product product3 = func.apply("Veggies", 70);

        System.out.println("Product1  " + product.getName() + " " + product.getPrice());

        System.out.println("Product2 " + product1.getName() + " " + product1.getPrice());

        System.out.println("Product3 " + product2.getName() + " " + product2.getPrice());

        System.out.println("Product4 " + product3.getName() + " " + product3.getPrice());

        Map<Product, Integer> cart = new HashMap<Product, Integer>();
        cart.put(product, 1);
        cart.put(product1, 2);
        cart.put(product2, 4);

        BiFunction<Product, Integer, Integer> func1 = (Product, quantity) -> Product.getPrice() * quantity;

        Integer cartValue = 0;

        for (Map.Entry<Product, Integer> entry : cart.entrySet()) {
            cartValue = cartValue + func1.apply(entry.getKey(), entry.getValue());
        }

        System.out.println("Cart Value " + cartValue);
    }

}
