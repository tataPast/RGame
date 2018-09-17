package com.tpasternak;

import java.util.ArrayList;


public class Arena {
    private String name;
    ArrayList<Robot> robots;
    String id;
    Robot robot = new Robot(id);


    public void startBattle(Battle battle) {
        ArrayList<Player> players = battle.players;
//        int random = (int) (Math.random() * players.size());
        players.get(0).getRobotForFight().getAction();
        players.get(1).getRobotForFight().getAction();
        System.out.println("==");




    }


}