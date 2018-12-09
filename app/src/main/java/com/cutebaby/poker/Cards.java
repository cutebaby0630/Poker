package com.cutebaby.poker;

public class Cards {
    static String[] color = {"♠", "♥", "♣", "♦"};
    int num;

    public Cards(int num) {
        this.num = num;
    }

    public String get() {
        return num % 13 + 1 + " " + color[num / 13];
    }
}
