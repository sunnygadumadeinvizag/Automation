package Appliances;

public class Fan implements Appliances {
    int unitConsumedByFan;
    int FanCostPerUnit;
    int totalPowerConsumed;

    public int calculatePowerConsumed() {
        return totalPowerConsumed = unitConsumedByFan * FanCostPerUnit;

    }

    @Override
    public void numberOfElectricityUnits(int units) {

        unitConsumedByFan = units;
    }

    @Override
    public void costPerElectrictyUnit(int costPerUnit) {
        FanCostPerUnit = costPerUnit;

    }

}
