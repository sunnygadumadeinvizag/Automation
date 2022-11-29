package com.HomeTasks.Decorator;

public class WidgetDecorator extends WebPage {
    WebPage webPage;

    public WidgetDecorator(WebPage webPage) {
        this.webPage = webPage;
    }

    @Override
    public int addWidget() {
        return webPage.addWidget();
    }
}
