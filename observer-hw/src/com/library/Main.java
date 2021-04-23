package com.library;

public class Main {

    public static void main(String[] args) {
        Observable sportsGroup = new Group("Sports");
        Observable cookingGroup = new Group("Master Chef");
        Observer memberA = new GroupMember("Ivan");
        Observer memberB = new GroupMember("Georgi");
        Observer memberC = new GroupMember("Petar");

        sportsGroup.join(memberA);
        sportsGroup.join(memberB);
        cookingGroup.join(memberC);
        cookingGroup.join(memberB);

        sportsGroup.post("Lindsey Vonn won the ski championship.");
        cookingGroup.post("Gordon Ramsay is a judge in Master Chef.");
    }
}
