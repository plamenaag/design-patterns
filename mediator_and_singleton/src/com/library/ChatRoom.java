package com.library;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
    private List<User> users;
    private List<String> msgs;
    private Bot bot;

    public ChatRoom(){
        users = new ArrayList<>();
        msgs = new ArrayList<>();
    }

    public void addUser(User user){
        users.add(user);
        user.addToChatRoom(this);
        System.out.println("New user added to chat room: " + user.getName());
    }

    public void removeUser(User user){
        users.remove(user);
    }

    public void addMsg(User user,String msg){
        if(bot==null && msg.equals("addBot")){
            this.bot = Bot.getInstance(this);
            users.stream().filter(p->!p.equals(user)).forEach(p->p.notify(user.getName() + " added a bot to the chat room."));
            return;
        }else if(bot!=null && msg.equals("cat")){
            bot.removeUser(user);
            users.stream().forEach(p->p.notify("The word 'cat' is forbidden, because of that user: " + user.getName() + " is removed from the chat room."));
            return;
        }

        msgs.add(msg);
        users.stream().filter(p->!p.equals(user)).forEach(p->p.receiveNewMsg(user,msg));
    }


}
