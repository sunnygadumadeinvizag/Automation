package HT1_LambdaExpressionAssignment;

import HT1_LambdaExpressionAssignment.Utilities.StringRotationInterface;

public class StringRotation {

    public static void verifyRotationWithoutLambda(String a, String b) {
        String temp = "";
        if (a.length() == b.length()) {
            temp = a + a;

            if (temp.contains(b)) {
                System.out.println(a + " and " + b + " are  rotation of each other");
            } else {
                System.out.println(a + " and " + b + " are not rotation of each other");
            }
        }
    }

    public static void verifyRotationWithLambda(String c, String d) {

        StringRotationInterface stringRotationInterface = (a, b) -> {
            String temp = "";
            if (a.length() == b.length()) {
                temp = a + a;

                if (temp.contains(b)) {
                    System.out.println(a + " and " + b + " are  rotation of each other");
                } else {
                    System.out.println(a + " and " + b + " are not rotation of each other");
                }
            }
        };

        stringRotationInterface.verifyRotation(c, d);


    }

    public static void main(String[] args) {
        String a = "HELLO";
        String b = "LOHEL";

        if (a.length() == b.length()) {
            //without lambda
//            verifyRotationWithoutLambda(a,b);

            //with lambda
            verifyRotationWithLambda(a, b);
        } else {
            System.out.println(a + " and " + b + " are not eligible for verifying rotation as length is not same");
        }


    }
}

