package com.library;

public interface Observable {

    void join(Observer observer);

    void leave(Observer observer);

    void post(String post);
}
