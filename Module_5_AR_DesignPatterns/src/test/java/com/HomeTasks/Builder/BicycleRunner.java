package com.HomeTasks.Builder;

public class BicycleRunner {
    public static void main(String[] args) {
        Bicycle.BicycleBuilder bicycleBuilder=new Bicycle.BicycleBuilder().gears(true).doubleSeats(true).doubleStands(true);
        Bicycle newBicycle = bicycleBuilder.build();
        System.out.println(newBicycle.isGears());
        System.out.println(newBicycle.isDoubleStands());
        System.out.println(newBicycle.isDoubleSeats());
        System.out.println(newBicycle.isCarrier());
    }
}
