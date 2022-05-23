package Bouquet;

public class BouquetCost {

    public static void main(String[] args) {

        Rose rose = new Rose();
        System.out.println("Calculating the cost of rose flowers in a bouquet");
        rose.flowerCount(5);
        rose.flowerCost(1);
        System.out.println(rose.calculateTotalCost());

        Lily lil = new Lily();
        System.out.println("Calculating the cost of lily flowers in a bouquet");
        lil.flowerCount(15);
        lil.flowerCost(3);
        System.out.println(lil.calculateTotalCost());

        Jasmine jas = new Jasmine();
        System.out.println("Calculating the cost of jasmine flowers in a bouquet");
        jas.flowerCount(10);
        jas.flowerCost(2);
        System.out.println(jas.calculateTotalCost());

        System.out.println("Total cost of all the flowers in a bouquet is INR:");

        System.out.println(rose.calculateTotalCost() + jas.calculateTotalCost() + lil.calculateTotalCost());


    }

}
