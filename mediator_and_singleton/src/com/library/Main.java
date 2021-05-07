package com.library;

public class Main {

    public static void main(String[] args) {

        ChatRoom chatRoom = new ChatRoom();
        User user1 = new User("Ivan");
        User user2 = new User("Georgi");
        User user3 = new User("Petar");


        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        user1.sendMsg("Hello");
        user2.sendMsg("addBot");
        user3.sendMsg("Hello there");
        user1.sendMsg("cat");
        user2.sendMsg("HaHaHa");

    }
}
