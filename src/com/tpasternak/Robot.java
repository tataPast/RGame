package com.tpasternak;

public class Robot {
    private String id;
    private boolean isWorking;
    private int winsCount;

    public enum Action{
        ATTACK,
        FLEE
    }

    public Robot(String id) {
        this.id = id;
        isWorking = true;
    }

    public String getId() {
        return id;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public int getWinsCount() {
        return winsCount;
    }

    public Action getAction() {
        int random = MathHelpers.randomWithRange(1, 6);
        Action tempAction;
        if (random <= 3) {
            tempAction = Action.FLEE;
        } else {
            tempAction = Action.ATTACK;
        }
        return tempAction;
    }

    public void crash() {
        isWorking = false;
    }

    public void incrementWinsCount() {
        winsCount ++;
    }
}
