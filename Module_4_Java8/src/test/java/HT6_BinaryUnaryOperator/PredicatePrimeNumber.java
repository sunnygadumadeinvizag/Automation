package HT6_BinaryUnaryOperator;

import java.util.function.IntPredicate;

public class PredicatePrimeNumber {

    public static void main(String[] args) {

        IntPredicate intPred = (i) -> {
            if (i <= 1) {
                return false;
            } else if (i == 2) {
                return true;
            } else {
                for (int j = 3; j < i; j++) {
                    if (i % j == 0)
                        return true;
                }
            }
            return false;
        };

        System.out.println("is 2 a Prime Number: " + intPred.test(2));
        System.out.println("is 0 a Prime Number " + intPred.test(0));
        System.out.println("is 10 a Prime Number: " + intPred.test(10));

    }

}
