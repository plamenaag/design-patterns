package com.library;

public class Bot {
    private static Bot instance;
    private ChatRoom chatRoom;
    private Bot() {
    }


    public static Bot getInstance(ChatRoom chatRoom) {
        if(instance == null) {
            instance = new Bot();
            instance.chatRoom = chatRoom;
        }
        return instance;
    }

    public void removeUser(User user){
        this.chatRoom.removeUser(user);
    }

}
