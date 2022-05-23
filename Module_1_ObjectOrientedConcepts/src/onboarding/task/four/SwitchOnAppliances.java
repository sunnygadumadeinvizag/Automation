package onboarding.task.four;

import onboarding.task.two.Flowers;

import java.util.*;

public class SwitchOnAppliances {
    private int consumptionInUnits = 0;
    private HashMap<String, Integer> OnAppliances = new HashMap<>();
    private HashMap<String, Integer> OnAppliancesWithPowerConsumption = new HashMap<>();

    public void switchOnAppliances(String applianceType, int applianceCount) {
        OnAppliances.put(applianceType, OnAppliances.get(applianceType) == null ? applianceCount : (OnAppliances.get(applianceType) + applianceCount));
    }

    public HashMap<String, Integer> getSwitchedOnAppliances() {
        return this.OnAppliances;
    }

    public int getConsumptionInUnits() {
        this.consumptionInUnits = 0;
        OnAppliances.forEach((k, v) -> {
            this.consumptionInUnits = this.consumptionInUnits + Appliances.applianceType.get(k) * v;
            OnAppliancesWithPowerConsumption.put(k, Appliances.applianceType.get(k) * v);
        });
        return this.consumptionInUnits;
    }

    public HashMap<String, Integer> sortByPowerConsumption() {
        this.getConsumptionInUnits();
        List<Map.Entry<String, Integer>> linkedList =
                new LinkedList<Map.Entry<String, Integer>>(OnAppliancesWithPowerConsumption.entrySet());

        h6.sort(linkedList, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> l1,
                               Map.Entry<String, Integer> l2) {
                return (l1.getValue()).compareTo(l2.getValue());
            }
        });

        // put data from sorted list to hashmap
        HashMap<String, Integer> sortedAppliancesWithPowerConsumption = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : linkedList) {
            sortedAppliancesWithPowerConsumption.put(aa.getKey(), aa.getValue());
        }
        return sortedAppliancesWithPowerConsumption;
    }
}
