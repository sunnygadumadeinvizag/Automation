package HT6_BinaryUnaryOperator;

import java.util.Random;
import java.util.function.IntSupplier;

public class SupplierRandomNumber {

    public static void main(String[] args) {

        IntSupplier intSup = () -> new Random().nextInt(4999);

        System.out.println("Generated Random Number below 5000 is: " + intSup.getAsInt());

    }

}
