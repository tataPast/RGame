package com.tpasternak;

import java.util.ArrayList;

public class Player {
    String name;
    ArrayList<Robot> robotPool;

    public Player(String name) {
        this.name = name;
    }

    public void getRobotsForFight() {
        int random = (int) (Math.random() * 41) + 10;
        for (int i = 0; i < random; i++) {
            robotPool.add(new Robot(name + "0" + i));
        }
    }
}