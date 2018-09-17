package com.tpasternak;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Robot> robots;

        ArrayList<Player> players = new ArrayList<Player>();
        players.add(new Player("Tanya", new ArrayList<Robot>()));
        players.add(new Player("Slava", new ArrayList<Robot>()));
        players.add(new Player("Mira", new ArrayList<Robot>()));
        players.add(new Player("Lena", new ArrayList<Robot>()));

        Battle firstBattle = new Battle(players);

        Arena arena = new Arena();
        arena.startBattle(firstBattle);
    }
}