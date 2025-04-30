package com.ohgiraffers.section01.array;

import java.util.Random;

public class Application5 {
    public static void main(String[] args) {
        //배열을 사용하는 예시 2
        String[] shapes = {"SPADE", "HEART", "CLUB", "DIAMOND"};
        String[] cardNumber = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};

        int randomShapeIndex = (int) (Math.random() * shapes.length);
        int randomCardNumberIndex = (int) (Math.random() * cardNumber.length);

        System.out.println(shapes[randomShapeIndex] + " " + cardNumber[randomCardNumberIndex]);
    }
}
