package Appliances;

public class Light implements Appliances {

    int unitConsumedByLight;
    int lightCostPerUnit;
    int totalPowerConsumed;

    public int calculatePowerConsumed() {


        return totalPowerConsumed = unitConsumedByLight * lightCostPerUnit;


    }

    @Override
    public void numberOfElectricityUnits(int units) {

        unitConsumedByLight = units;
    }

    @Override
    public void costPerElectrictyUnit(int costPerUnit) {
        lightCostPerUnit = costPerUnit;


    }

}
