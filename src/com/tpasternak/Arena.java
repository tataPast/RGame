package com.tpasternak;

import java.util.ArrayList;

public class Arena {



    public void startBattle(Battle battle){
        ArrayList<Player> players = battle.players;
        int random = (int) (Math.random() * players.size());

        Player winner = players.get(random);


        System.out.println("Победил игрок " + winner.getName());

    }


}