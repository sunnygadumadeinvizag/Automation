package NewYearGift;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cost of 1 perk chocolate is Rs 5\n.... Enter the number of perk chocolate you want to purchase");
        Perk perk = new Perk();
        perk.setCount(sc.nextInt());
        perk.setCost(5);

        System.out.println("Cost of 1 fiveStar chocolate is Rs 10\n.... Enter the number of fiveStar chocolate you want to purchase");
        FiveStar fiveStar = new FiveStar();
        fiveStar.setCount(sc.nextInt());
        fiveStar.setCost(10);

        System.out.println("Cost of 1kg MysorePak is Rs 500\n.... Enter how many kg's MysorePak you want to purchase");
        MysorePak ladoo = new MysorePak();
        ladoo.setCount(sc.nextInt());
        ladoo.setCost(500);

        System.out.println("Cost of 1kg Motichoor is Rs 300\n.... Enter how many kg's Motichoor you want to purchase");
        Motichoor jamun = new Motichoor();
        jamun.setCount(sc.nextInt());
        jamun.setCost(300);

        List<Chocolates> choc = new ArrayList<Chocolates>();
        choc.add(perk);
        choc.add(fiveStar);

        List<Sweets> sweet = new ArrayList<Sweets>();
        sweet.add(ladoo);
        sweet.add(jamun);

        System.out.println("Total cost for new year gift is:" + costOfGift(choc, sweet));

    }

    static double costOfGift(List<Chocolates> choc, List<Sweets> sweet) {
        double giftCost = 0.0;
        for (Chocolates c : choc) {
            giftCost += c.costOfChocolate(c.getCost(), c.getCount());
        }
        for (Sweets s : sweet) {
            giftCost += s.costOfSweets(s.getCost(), s.getCount());
        }
        return giftCost;
    }


}
