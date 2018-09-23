package com.tpasternak;

public class Match {
    private Player player1;
    private Player player2;
    private Player winner;


    public Match(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public Player getWinner() {
        return winner;
    }

    public void start() {
        Robot player1Robot = player1.getRobotForFight();
        Robot player2Robot = player2.getRobotForFight();

        while (player1Robot != null && player2Robot != null) {
            RobotsFight robotsFight = new RobotsFight(player1Robot, player2Robot);
            robotsFight.start();
            player1Robot = player1.getRobotForFight();
            player2Robot = player2.getRobotForFight();
        }

        if (player1Robot == null) {
            winner = player2;
        } else {
            winner = player1;
        }
    }
}
