package com.library;

import java.util.ArrayList;
import java.util.List;

public class Group implements Observable {

    private List<Observer> observers;
    private List<String> posts;
    private String latestPost;
    private String name;

    public Group(String name) {
        this.name = name;
        this.observers = new ArrayList<>();
        this.posts = new ArrayList<>();
    }

    @Override
    public void join(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void leave(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void post(String post) {
        this.latestPost = post;
        this.posts.add(post);
        for (Observer observer : observers) {
            observer.setPost(post);
        }
    }
}
