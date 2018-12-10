package com.cutebaby.poker;

public class Cards {
    static String[] color = {"♠", "♥", "♣", "♦"};
    int num;

    public Cards(int num) {

        this.num = num;
    }

    public String get() {
        switch (num % 13 + 1 ){
            case 1:
                return "A" + " " + color[num / 13];
            case 11:
                return "J" + " " + color[num / 13];
            case 12:
                return "Q" + " " + color[num / 13];
            case 13:
                return "K" + " " + color[num / 13];
                default:
                    return num % 13 + 1 + " " + color[num / 13];
        }
//        return num % 13 + 1 + " " + color[num / 13];
    }
}
