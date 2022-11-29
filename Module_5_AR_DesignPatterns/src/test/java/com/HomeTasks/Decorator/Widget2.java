package com.HomeTasks.Decorator;

public class Widget2 extends WidgetDecorator{
    public Widget2(WebPage webPage) {
        super(webPage);
    }

    @Override
    public int addWidget(){
        return webPage.addWidget()+addWidgetRank();
    }

    private int addWidgetRank()
    {
        return 2;
    }
}
