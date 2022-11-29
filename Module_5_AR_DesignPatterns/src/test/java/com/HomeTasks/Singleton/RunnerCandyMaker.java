package com.HomeTasks.Singleton;

public class RunnerCandyMaker {
    public static void main(String[] args) {
        CandyMaker candyMaker=CandyMaker.getInstance();
        candyMaker.fill();
        candyMaker.boil();
        candyMaker.drain();
        System.out.println(candyMaker);
        CandyMaker candyMaker1=CandyMaker.getInstance();
        candyMaker1.fill();
        candyMaker1.boil();
        candyMaker.drain();
        System.out.println(candyMaker1);
    }
}
