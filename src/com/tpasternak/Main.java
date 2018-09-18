package com.tpasternak;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Robot> robots = new ArrayList<>();
        Player player1 = new Player("zzz", robots);
        Player player2 = new Player("xxx", robots);



        Battle firstBattle = new Battle(player1, player2);
        player1.getRobotForFight();
        player2.getRobotForFight();

        Arena arena = new Arena();
        arena.startBattle(firstBattle);
    }
}