package onboarding.task.one;

import java.util.Scanner;

public class AppleCount {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("How many apples with Daniels:");
        float applesWithDaniels=sc.nextFloat();
        sc.nextLine();
        System.out.print("How many apples with Amber:");
        float applesWithAmber=sc.nextFloat();
        sc.nextLine();
        System.out.println("Total apples with Daniels and Amber:"+(applesWithDaniels+applesWithAmber));
    }
}
