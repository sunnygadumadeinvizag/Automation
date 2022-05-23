package onboarding.task.two;

import onboarding.task.one.Pizza;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BouquestShop {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Number of Bouquets to order:");
        int noOfBouquets = sc.nextInt();
        sc.nextLine();
        List<Bouquet> Bouquets = new ArrayList<>();
        int totalCostPrice = 0;
        int i = 1;
        while (i <= noOfBouquets) {
            System.out.println("Enter Bouquet " + (i++) + " details:");

            Bouquet Bq = new Bouquet();
            while (true) {
                System.out.print("Enter Flower(Rose-1$/Jasmine-2$/Lyly-3$):");
                String flower = sc.nextLine();
                System.out.print("How many " + flower + " flowers needed?:");
                int flowerCount = sc.nextInt();
                sc.nextLine();
                Bq.addFlowersToBouquet(flower, flowerCount);
                System.out.print("Want to add new flowers or exit?(add/exit): ");
                String toppingsDecision = sc.nextLine();
                if ((toppingsDecision).equals("exit")) {
                    break;
                }
            }
            Bouquets.add(Bq);
            System.out.println("Total Cost Price of Bouquet " + (i - 1) + ":" + Bq.costOfBouquet() + "$ only.");
            totalCostPrice = totalCostPrice + Bq.costOfBouquet();
        }
        System.out.println("Total Cost Price of Bouquets:" + totalCostPrice + "$ only.");
    }

}
