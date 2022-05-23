package onboarding.task.three;

import java.util.Scanner;

public class PyramidWithForLoop {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("How Many Rows:");
        int rows=sc.nextInt();
        sc.nextLine();
        System.out.print("Number To Be Added To Each Number:");
        int addNumber=sc.nextInt();
        sc.nextLine();
        int number=0;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++) {
                System.out.print(number+" ");
                number=number+addNumber;
            }
            System.out.println();
        }
    }
}
