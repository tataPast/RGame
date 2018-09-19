package com.tpasternak;



public class Battle {
    Robot robot1;
    Robot robot2;

    public Battle(Player player1, Player player2) {
        Robot.Action action1 = player1.getRobotForFight().getAction();
        Robot.Action action2 = player2.getRobotForFight().getAction();


        do {
            robot1 = player1.getRobotForFight();
            robot2 = player2.getRobotForFight();
        }
        while (robot1.isWorking() | robot2.isWorking()); {

            if (robot1.getAction() ==  Robot.Action.ATTACK && robot2.getAction() ==  Robot.Action.ATTACK ) {
                robot1.addWin(1);
                robot2.addWin(1);
                System.out.println(robot1.getId() + " win+1");
                System.out.println(robot2.getId() + " win+1");

            } else if (robot1.getAction() ==  Robot.Action.FLEE && robot2.getAction() ==  Robot.Action.FLEE ) {
                System.out.println("Оба робота сбежали");
                robot1.setIsWorking();
                robot2.setIsWorking();


            } else if (robot1.getAction() ==  Robot.Action.ATTACK && robot2.getAction() ==  Robot.Action.FLEE ) {
                robot1.addWin(3);
                robot2.setIsWorking();
                System.out.println(robot1.getId() + " win+3");
                System.out.println(robot2.getId() + " broke");

            } else if (robot1.getAction() ==  Robot.Action.FLEE && robot2.getAction() ==  Robot.Action.ATTACK ) {
                robot1.setIsWorking();
                robot2.addWin(3);
                System.out.println(robot1.getId() + " broke");
                System.out.println(robot2.getId() + " win+3");
            }
        }
    }
}
