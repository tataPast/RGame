package com.tpasternak;


public class Battle {
    Robot robot1;
    Robot robot2;

    public Battle(Player player1, Player player2) {
        String action1 = player1.getRobotForFight().getAction();
        String action2 = player2.getRobotForFight().getAction();

        do {
            robot1 = player1.getRobotForFight();
            robot2 = player2.getRobotForFight();
        }
        while (robot1.isWorking() | robot2.isWorking()); {

            if (action1.contains("Attack") == action2.contains("Attack")) {
                robot1.addWin(1);
                robot2.addWin(1);
                System.out.println(robot1.getId() + " win+1");
                System.out.println(robot2.getId() + " win+1");

            } else if (action1.contains("Flee") == action2.contains("Flee")) {
                System.out.println("Оба робота сбежали");
                robot1.setIsWorking();
                robot2.setIsWorking();


            } else if (action1.contains("Attack") | action2.contains("Flee")) {
                robot1.addWin(3);
                robot2.setIsWorking();
                System.out.println(robot1.getId() + " win+3");
                System.out.println(robot2.getId() + " broke");

            } else if (action1.contains("Flee") | action2.contains("Attack")) {
                robot1.setIsWorking();
                robot2.addWin(3);
                System.out.println(robot1.getId() + " broke");
                System.out.println(robot2.getId() + " win+3");
            }
        }
    }
}
