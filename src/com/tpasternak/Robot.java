package com.tpasternak;

public class Robot {
    private String id;
    boolean isWorking;
    private int winsCount;

    public Robot(String id) {
        this.id = id;
        isWorking = true;
    }

    public String getAction() {
        int random = (int) (Math.random() * 6);
        String tempAction;
        if (random <= 2) {
            tempAction = "Flee";
        } else {
            tempAction = "Attack";
        }
        return tempAction;
    }

    public void setIsWorking() {
        isWorking = false;
    }

    public void addWin() {
        winsCount++;
    }
}
