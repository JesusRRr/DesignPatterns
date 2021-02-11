package com.rolon.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Observable{
    private List<Observer> channelSubscriberList;

    public YoutubeChannel(){
        this.channelSubscriberList = new ArrayList<>();
    }
    @Override
    public void attach(Observer o) {
        channelSubscriberList.add(o);
    }

    @Override
    public void detach(Observer o) {
        channelSubscriberList.remove(o);
    }

    @Override
    public void notifyObserver() {
        channelSubscriberList.forEach(o -> {
            o.update();
        });
    }
}
