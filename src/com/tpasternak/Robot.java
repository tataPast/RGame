package com.tpasternak;

public class Robot {

    private String id;
    private boolean isWorking;
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

    public int getWinsCount() {
        return winsCount;
    }

    public String getId() {
        return id;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWinsCount(int winsCount) {
        this.winsCount = winsCount;
    }

    public void setIsWorking() {
        isWorking = false;
    }

    public void addWin(int i) {
        winsCount =+ i;
    }
}
