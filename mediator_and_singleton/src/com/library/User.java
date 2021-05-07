package com.library;

public class User {
    private String name;
    private ChatRoom chatRoom;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void addToChatRoom(ChatRoom chatRoom){
        this.chatRoom = chatRoom;
    }

    public void sendMsg(String msg){
        System.out.println(this.name + " is sending new msg: " + msg);
        this.chatRoom.addMsg(this,msg);
    }

    public void receiveNewMsg(User user,String msg){
        System.out.println(this.name + " received new msg from " + user.getName() + ": " + msg);
    }

    public void notify(String msg){
        System.out.println(this.name + " received new notification: " + msg);
    }
}
