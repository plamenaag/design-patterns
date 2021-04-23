package com.library;

public class GroupMember implements Observer {

    private String post;
    private String name;

    public GroupMember(String name) {
        this.name = name;
    }

    @Override
    public void setPost(String post) {
        this.post = post;
        System.out.println(name + " received new post: " + post);
    }
}
