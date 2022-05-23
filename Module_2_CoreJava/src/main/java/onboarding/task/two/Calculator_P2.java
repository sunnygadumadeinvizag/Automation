package onboarding.task.two;

import java.util.Scanner;

public class Calculator_P2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number1:");
        float num1=sc.nextFloat();
        sc.nextLine();
        System.out.print("Enter number2:");
        float num2=sc.nextFloat();
        sc.nextLine();
        float result=0;
        System.out.println("Enter Math Operation:");
        System.out.println("Addition/Subtraction/Multiplication/Division(a/b)/Remainder(a%b)/Percentage(a*100/b)");
        String mathOperation=sc.nextLine();
        switch(mathOperation){
            case "Addition":
                result=num1+num2;
                break;
            case "Subtraction":
                result=num1-num2;
                break;
            case "Multiplication":
                result=num1*num2;
                break;
            case "Division":
                result=num1/num2;
                break;
            case "Remainder":
                result=num1%num2;
                break;
            case "Percentage":
                result=num1*100/num2;
                break;
        }
        System.out.println(mathOperation+" of "+num1+", "+num2+":"+result);
    }
}
