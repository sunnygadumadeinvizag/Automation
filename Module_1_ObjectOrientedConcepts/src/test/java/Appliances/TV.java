package Appliances;

public class TV implements Appliances {
    int unitConsumedByTV;
    int TVCostPerUnit;
    int totalPowerConsumed;

    public int calculatePowerConsumed() {
        return totalPowerConsumed = unitConsumedByTV * TVCostPerUnit;

    }

    @Override
    public void numberOfElectricityUnits(int units) {
        unitConsumedByTV = units;

    }

    @Override
    public void costPerElectrictyUnit(int costPerUnit) {
        TVCostPerUnit = costPerUnit;

    }

}
