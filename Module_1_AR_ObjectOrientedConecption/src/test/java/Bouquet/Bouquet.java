package Bouquet;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Bouquet {
    private int costPrice = 0;
    private List<Flowers> addedFlowers = new ArrayList<Flowers>();

    public void addFlowersToBouquet(Flowers flower) {
        addedFlowers.add(flower);
    }

    public int costOfBouquet() {
        this.costPrice=0;
        addedFlowers.forEach((n) -> {
            this.costPrice = this.costPrice + n.getCost();
        });
        return this.costPrice;
    }
}
