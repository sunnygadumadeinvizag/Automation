package h2;

import java.util.Arrays;
import java.util.Scanner;


class HomeTask_Comparator {


    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Player[] player = new Player[n];

        for (int i = 0; i < n; i++) {
            player[i] = new Player(sc.next(), sc.nextInt());
        }

        sc.close();
        Checker checker = new Checker();
        Arrays.sort(player, checker);
        for (int i = 0; i < player.length; i++) {
            System.out.println(player[i].name + " " + player[i].score);
        }
    }

}
        
