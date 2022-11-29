package com.HomeTasks.Decorator;

public class Widget1 extends WidgetDecorator{
    public Widget1(WebPage webPage) {
        super(webPage);
    }

    @Override
    public int addWidget(){
        return webPage.addWidget()+addWidgetRank();
    }

    private int addWidgetRank()
    {
        return 1;
    }
}
