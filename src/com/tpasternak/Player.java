package com.tpasternak;

import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Robot> robotPool;

    public Player(String name) {
        this.name = name;
        robotPool = new ArrayList<Robot>();
        for (int i = 0; i < MathHelpers.randomWithRange(10, 50); i++) {
            robotPool.add(new Robot(name + "-" + i));
        }
        System.out.println(name + " has " + robotPool.size() + " robots.");
    }

    public String getName() {
        return name;
    }

    private ArrayList<Robot> getWorkingRobots() {
        ArrayList<Robot> workingRobots = new ArrayList<>();

        for (int i = 0; i < robotPool.size(); i++) {
            Robot robot = robotPool.get(i);
            if (robot.isWorking()) {
                workingRobots.add(robot);
            }
        }
        return workingRobots;
    }

    public Robot getRobotForFight() {
        ArrayList<Robot> workingRobots = getWorkingRobots();
        if (workingRobots.isEmpty()){
            return null;
        }
        int robotIndex = MathHelpers.randomWithRange(0, workingRobots.size() - 1);
        Robot readyRobot = workingRobots.get(robotIndex);
        return readyRobot;
    }
}