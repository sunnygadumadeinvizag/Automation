package onboarding.task.four;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Home {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        List<SwitchOnAppliances> switchedOnAppliances = new ArrayList<>();
        int totalCostPrice = 0;
        System.out.println("Enter appliances to switch on:");

        SwitchOnAppliances switchedOn = new SwitchOnAppliances();
        while (true) {
            System.out.print("Enter Appliance(Fan-1u/Light-2u/TV-3u/Laptop-4u):");
            String appliance = sc.nextLine();
            System.out.print("How many " + appliance + "s to switch on?:");
            int flowerCount = sc.nextInt();
            sc.nextLine();
            switchedOn.switchOnAppliances(appliance, flowerCount);
            System.out.print("Want to add more appliances or exit?(add/exit): ");
            String decision = sc.nextLine();
            if ((decision).equals("exit")) {
                break;
            }
        }
        System.out.println("Sort appliances by power consumption:");
        switchedOn.sortByPowerConsumption().forEach((k, v) -> {
            System.out.println("Switched on: " + switchedOn.getSwitchedOnAppliances().get(k) + " " + k + "s and consumption:" + v + " units");
        });

        System.out.println("Total power consumption:" + switchedOn.getConsumptionInUnits() + " units only.");


    }
}
