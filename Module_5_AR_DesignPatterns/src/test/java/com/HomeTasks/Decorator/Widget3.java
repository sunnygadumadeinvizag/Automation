package com.HomeTasks.Decorator;

public class Widget3 extends WidgetDecorator{
    public Widget3(WebPage webPage) {
        super(webPage);
    }

    @Override
    public int addWidget(){
        return webPage.addWidget()+addWidgetRank();
    }

    private int addWidgetRank()
    {
        return 3;
    }
}
