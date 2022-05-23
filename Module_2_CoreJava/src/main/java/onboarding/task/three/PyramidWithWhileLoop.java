package onboarding.task.three;

import java.util.Scanner;

public class PyramidWithWhileLoop {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("How Many Rows:");
        int rows=sc.nextInt();
        sc.nextLine();
        System.out.print("Number To Be Added To Each Number:");
        int addNumber=sc.nextInt();
        sc.nextLine();
        int number=0;
        int i=1;
        while(i<=rows){
            int j=1;
            while(j<=i) {
                System.out.print(number+" ");
                number=number+addNumber;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
