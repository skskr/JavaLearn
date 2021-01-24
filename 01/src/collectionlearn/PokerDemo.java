package collectionlearn;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PokerDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();

        /**
         * 牌盒装牌
         */
        String[] colors = {"♤","♢","♡","♧"};
        String[] numbers = {"1","2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        for(String color:colors){
            for (String number:numbers){
                arrayList.add(color+number);
            }
        }
        arrayList.add("大王");
        arrayList.add("小王");

        //洗牌
        Collections.shuffle(arrayList);

        ArrayList<String> player1 = new ArrayList<String>();
        ArrayList<String> player2 = new ArrayList<String>();
        ArrayList<String> player3 = new ArrayList<String>();
        ArrayList<String> player4 = new ArrayList<String>();



    }
}
