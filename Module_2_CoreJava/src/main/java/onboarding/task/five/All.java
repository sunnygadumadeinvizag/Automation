package onboarding.task.five;

public class All {
    public static void main(String[] args) {

        System.out.println("Q1: --------------------");
        System.out.println(caughtSpeeding(65, true));



        System.out.println("Q2: ---------------------");
        System.out.println(isNumberContainsSix(6, 4));
        System.out.println(isNumberContainsSix(9, 6));
        System.out.println(isNumberContainsSix(5, 1));
        System.out.println(isNumberContainsSix(10, 5));


        System.out.println("Q3: ---------------------");
        System.out.println(teaParty(5, 10));
        System.out.println(teaParty(1, 10));
        System.out.println(teaParty(3, 6));
        System.out.println(teaParty(15, 30));
        System.out.println(teaParty(6, 7));



        System.out.println("Q4: ---------------------");
        System.out.println(blueTicket(9, 1, 0));
        System.out.println(blueTicket(6, 1, 4));
        System.out.println(blueTicket(19, 1, 10));
        System.out.println(blueTicket(19, 3, 9));


        System.out.println("Q5: ---------------------");
        System.out.println(inOrder(1, 2, 4, false));
        System.out.println(inOrder(1, 2, 1, false));
        System.out.println(inOrder(1, 1, 2, true));


        System.out.println("Q6: ---------------------");
        System.out.println(shareDigit(12, 23));
        System.out.println(shareDigit(12, 43));
        System.out.println(shareDigit(12, 44));


        System.out.println("Q7: ---------------------");
        System.out.println(sumLimit(2, 3));
        System.out.println(sumLimit(8, 3));
        System.out.println(sumLimit(8, 1));


        System.out.println("Q8: ---------------------");
        System.out.println(withoutString("Hello there", "llo"));
        System.out.println(withoutString("Hello there", "e"));
        System.out.println(withoutString("Hello there", "x"));


        System.out.println("Q9: ---------------------");
        System.out.println(maxBlock("hoopla"));
        System.out.println(maxBlock("abbCCCddBBBxx"));
        System.out.println(maxBlock("") );



    }

    public static int maxBlock(String str){
        int len = str.length();
        int count = 0, temp = 1;

        if (len == 0) return 0;

        for (int i = 0; i < len -1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                temp++;
            } else {
                temp = 1;
            }
            if (temp > count){
                count = temp;
            }
        }
        return count;
    }

    public static String withoutString(String base, String remove) {
        String result = base
                .replace(remove, "")
                .replace(remove.toUpperCase(), "")
                .replace(remove.toLowerCase(), "");
        return result;
    }


    public static int sumLimit(int a, int b) {
        String str1 = String.valueOf(a);
        String str2 = String.valueOf(a + b);

        if (str1.length() == str2.length()) return a + b;
        else return a;
    }

    public static boolean shareDigit(int a, int b) {
        if ((a % 10 == b / 10) || (a / 10 == b % 10) || (a % 10 == b % 10) || (a / 10 == b / 10))
            return true;
        else return false;
    }

    public static boolean inOrder(int a, int b, int c, boolean bOk) {
        if ((bOk) && c > b) return true;
        else if ((!bOk) && b > a && c > b) return true;
        else return false;
    }


    public static int blueTicket(int a, int b, int c) {
        if (a + b == 10 || b + c == 10 || c + a == 10) return 10;
        if (a + b == 10 + (b + c) || a + b == 10 + (c + a)) return 5;
        else return 0;
    }


    public static int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) return 0;
        if ((tea > candy && tea >= 2 * candy) || (tea < candy && candy >= 2 * tea)) return 2;
        else return 1;
    }

    public static boolean isNumberContainsSix(int num1, int num2) {
        if (num1 == 6 || num2 == 6) return true;
        else if (Math.abs((num1 + num2)) == 6 || Math.abs((num1 - num2)) == 6) return true;
        else return false;
    }

    public static int caughtSpeeding(int speed, boolean isBirthday) {
        int temp = 0;

        if (isBirthday) temp = 5;
        if (speed >= 0 + temp && speed <= 60 + temp) return 0;
        else if (speed > 60 + temp && speed <= 80 + temp) return 1;
        else return 2;
    }
}
