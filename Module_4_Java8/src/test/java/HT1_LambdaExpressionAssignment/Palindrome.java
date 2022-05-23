package HT1_LambdaExpressionAssignment;

import java.util.stream.IntStream;

public class Palindrome {

    public static Boolean isPalindromeWithoutLambda(String name) {

        //with
        char[] array = name.toCharArray();

        int firstCharacter = 0;
        int lastCharacter = array.length - 1;

        while (firstCharacter < lastCharacter) {
            if (array[firstCharacter] != array[lastCharacter]) {
                return false;
            }
            firstCharacter++;
            lastCharacter--;
        }
        return true;
    }

    public static boolean isPalindromeWithLambda(String name) {
        return IntStream.range(0, name.length() / 2)
                .allMatch(i -> name.charAt(i) == name.charAt(name.length() - i - 1));
    }


    public static void main(String[] args) {


        String name = "naman";

        //without lambda
        if (isPalindromeWithoutLambda(name)) {
            System.out.println(name + " is Palindrome without Lambda");
        } else {
            System.out.println(name + " is not Palindrome without Lambda");
        }

        //with lambda
        if (isPalindromeWithLambda(name)) {
            System.out.println(name + " is Palindrome with Lambda");
        } else {
            System.out.println(name + " is not Palindrome with Lambda");
        }


    }

}
