package com.company.design.observer;

public class Button{

    private String name;
    private IButtonListener buttonListensr;

    public Button(String name) {
        this.name = name;
    }

    //    public Button(IButtonListensr iButtonListensr) {
//        this.buttonListensr = iButtonListensr;
//    }

    public void click(String message) {
        buttonListensr.clickEvent(message);
    }

    public void addListener(IButtonListener buttonListensr) {
        this.buttonListensr = buttonListensr;
    }
}
