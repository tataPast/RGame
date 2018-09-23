package com.tpasternak;


public class RobotsFight {
    private Robot robot1;
    private Robot robot2;

    public RobotsFight(Robot robot1, Robot robot2) {
        this.robot1 = robot1;
        this.robot2 = robot2;
    }

    public void start() {
        if (!robot1.isWorking() || !robot2.isWorking()) {
            System.out.println("Broken robots can't fight.");
            return;
        }
        Robot.Action robot1Action = robot1.getAction();
        Robot.Action robot2Action = robot2.getAction();

        /*- Если один атакует а второй трусит: выигрывает тот кто атаковал.
        В этом случае победившему роботу начисляется одна победа, а статус второго робота меняется на "сломан".*/
        if (robot1Action == Robot.Action.ATTACK && robot2Action == Robot.Action.FLEE) {
            robot1.incrementWinsCount();
            robot2.crash();
        }

        if (robot2Action == Robot.Action.ATTACK && robot1Action == Robot.Action.FLEE) {
            robot2.incrementWinsCount();
            robot1.crash();
        }
        /*
        - Если оба атакуют: производится рандом число от 1 до 6ти. Выигрывает тот чье число больше.
        */

        if (robot1Action == Robot.Action.ATTACK && robot2Action == Robot.Action.ATTACK) {
            int robot1HitPower = MathHelpers.randomWithRange(1, 6);
            int robot2HitPower = MathHelpers.randomWithRange(1, 6);

            if (robot1HitPower > robot2HitPower){
                robot1.incrementWinsCount();
                robot2.crash();
            } else if (robot1HitPower < robot2HitPower){
                robot2.incrementWinsCount();
                robot1.crash();
            } else {
                /*
                - Если числа равные, производится повторный бросок.
                    */
                robot1HitPower = MathHelpers.randomWithRange(1, 6);
                robot2HitPower = MathHelpers.randomWithRange(1, 6);
                if (robot1HitPower > robot2HitPower){
                    robot1.incrementWinsCount();
                    robot2.crash();
                }else if (robot1HitPower < robot2HitPower){
                    robot2.incrementWinsCount();
                    robot1.crash();
                } else {
                    /*
                    Если и при повторном броске результат равный, обоим присуждается победа и оба становятся сломанными.
                    */
                    robot1.incrementWinsCount();
                    robot1.crash();
                    robot2.incrementWinsCount();
                    robot2.crash();
                }
            }

        }
        /*
        - Если оба струсили: победа обоим не начисляется.
         */
    }
}



