package h4;

import java.util.Scanner;
import java.util.Stack;

public class BalancedStringStack {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            System.out.println(checkBalancedString(input));
        }


    }

    public static boolean checkBalancedString(String s) {

        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '[' || c == '(' || c == '{') {
                stk.push(c);
            } else if (c == ']') {
                if (stk.isEmpty() || stk.pop() != '[') {
                    return false;
                }
            } else if (c == ')') {
                if (stk.isEmpty() || stk.pop() != '(') {
                    return false;
                }
            } else if (c == '}') {
                if (stk.isEmpty() || stk.pop() != '{') {
                    return false;
                }

            }

        }
        return stk.isEmpty();
    }
}
