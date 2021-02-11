package com.rolon.behavioral.observer;

public class ChannelSubscriber implements Observer{
    private String name;

    ChannelSubscriber(String name){
        this.name=name;
    }
    @Override
    public void update() {
        String message = new StringBuilder("Hi ")
                .append(name)
                .append(" a new video was upload")
                .toString();
        System.out.println(message);
    }
}
