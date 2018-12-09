package com.cutebaby.poker;

import java.util.Random;

public class Poker {
    Cards[] cards = new Cards[52];
    Random r = new Random(52);
//   生出52張牌
    public Poker(){
        for (int i = 0;i<52;i++) {
            cards[i] = new Cards(i);
        }
    }

    public void print(){
        for (int i=0;i<52;i++){
            System.out.print(cards[i].get());
        }
    }

    public void shuffle(){
        for(int i= 0;i<52;i++){
            int j = r.nextInt();
             Cards tmp = cards[i];
             cards[i] = cards[j];
             cards[j] = tmp;

        }
    }
}
