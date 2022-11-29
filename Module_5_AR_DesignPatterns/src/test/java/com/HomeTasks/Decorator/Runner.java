package com.HomeTasks.Decorator;

public class Runner {
    public static void main(String[] args) {
        WebPage webPage=new Widget1(new Widget2(new DeskstopVersion()));
        System.out.println(webPage.addWidget());

        WebPage webPage1=new Widget3(new Widget2(new MobileVersion()));
        System.out.println(webPage1.addWidget());
    }
}
