package com.tpasternak;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Player> players = new ArrayList<Player>();
        players.add(new Player("Tanya"));
        players.add(new Player("Slava"));
        players.add(new Player("Mira"));
        players.add(new Player("Lena"));

        Battle firstBattle = new Battle(players);

        Arena arena = new Arena();
        arena.startBattle(firstBattle);
    }
}