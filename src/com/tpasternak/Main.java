package com.tpasternak;


public class Main {

    public static void main(String[] args) {
        Player player1 = new Player("Tanya");
        Player player2 = new Player("Lena");
        Match match = new Match(player1, player2);

        match.start();

        System.out.println("The winner is " + match.getWinner().getName());
    }
}