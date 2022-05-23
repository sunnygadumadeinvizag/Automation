package HT6_BinaryUnaryOperator;

import java.util.function.IntConsumer;

public class ConsumerSquareOfNumber {

    public static void main(String[] args) {

        IntConsumer intCon = i -> System.out.println(i * i);

        intCon.accept(9);

    }

}
