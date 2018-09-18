package com.tpasternak;

import java.util.ArrayList;

public class Player {
    private String name;

    private ArrayList<Robot> robotPool;

    public Player(String name, ArrayList<Robot> robotPool) {
        this.name = name;
        this.robotPool = robotPool;
        int random = (int) (Math.random() * 41) + 10;
        for (int i = 0; i < random; i++) {
            robotPool.add(new Robot(name + "0" + i));
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<Robot> getRobotPool() {
        return robotPool;
    }



    public Robot getRobotForFight() {
        for (int i = 0; i < robotPool.size(); i++) {
            Robot robot = robotPool.get(i);
            if (robotPool.get(i).isWorking()) {
                return robot;
            }
        } return null;
    }
}
