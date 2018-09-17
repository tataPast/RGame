package com.tpasternak;

import java.util.ArrayList;

public class Arena {

    public void startBattle(Battle battle) {
        ArrayList<Player> players = battle.players;
//        int random = (int) (Math.random() * players.size());
        String move1 = players.get(0).getRobotForFight().getAction();
        String move2 = players.get(1).getRobotForFight().getAction();
        System.out.println("Робот игрока " + players.get(0).getName() + " выбрал экшен '" + move1 +"'");
        System.out.println("Робот игрока " + players.get(1).getName() + " выбрал экшен '" + move2 +"'");




    }


}