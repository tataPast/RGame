package com.tpasternak;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Robot> robots = new ArrayList<>();



        Battle firstBattle = new Battle(new Player("Tanya", robots),
                new Player("Slava", robots));

        Arena arena = new Arena();
        arena.startBattle(firstBattle);
    }
}