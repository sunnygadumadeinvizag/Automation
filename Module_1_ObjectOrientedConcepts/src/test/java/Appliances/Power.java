package Appliances;

public class Power {


    public static void main(String[] args) {
        Light l = new Light();
        l.numberOfElectricityUnits(2);
        l.costPerElectrictyUnit(2);

        int arr = l.calculatePowerConsumed();
        System.out.println("Consumption of light in the house is" + l.calculatePowerConsumed());
        Fan f = new Fan();
        f.numberOfElectricityUnits(1);
        f.costPerElectrictyUnit(3);
        System.out.println("Consumption of fan in the house is" + f.calculatePowerConsumed());
        TV t = new TV();
        t.numberOfElectricityUnits(3);
        t.costPerElectrictyUnit(1);
        System.out.println("Consumption of TV in the house is" + t.calculatePowerConsumed());
        Laptop l1 = new Laptop();
        l1.numberOfElectricityUnits(5);
        l1.costPerElectrictyUnit(2);
        System.out.println("Consumption of laptop in the house is" + l1.calculatePowerConsumed());

        System.out.println(l1.calculatePowerConsumed() + l.calculatePowerConsumed() + f.calculatePowerConsumed() + t.calculatePowerConsumed());

    }

}
