package com.rolon.behavioral.observer;

public class Main {
    public static void main(String[] args){
        YoutubeChannel myChannel = new YoutubeChannel();
        ChannelSubscriber s1 = new ChannelSubscriber("Subscriber1");
        ChannelSubscriber s2 = new ChannelSubscriber("Subscriber2");
        ChannelSubscriber s3 = new ChannelSubscriber("Subscriber3");
        myChannel.attach(s1);
        myChannel.attach(s2);
        myChannel.attach(s3);
        myChannel.uploadNewVideo("Working with Design Patterns");
        myChannel.detach(s3);
        myChannel.uploadNewVideo("Working with Observer Design pattern");
    }
}
