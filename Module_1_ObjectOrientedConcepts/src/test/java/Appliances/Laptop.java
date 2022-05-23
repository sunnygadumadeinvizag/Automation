package Appliances;

public class Laptop implements Appliances {

    int unitConsumedByLaptop;
    int LaptopCostPerUnit;
    int totalPowerConsumed;

    public int calculatePowerConsumed() {

        return totalPowerConsumed = unitConsumedByLaptop * LaptopCostPerUnit;
    }

    @Override
    public void numberOfElectricityUnits(int units) {
        unitConsumedByLaptop = units;

    }

    @Override
    public void costPerElectrictyUnit(int costPerUnit) {
        LaptopCostPerUnit = costPerUnit;


    }

}
