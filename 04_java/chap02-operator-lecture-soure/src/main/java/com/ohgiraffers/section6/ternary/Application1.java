package com.ohgiraffers.section6.ternary;

public class Application1 {
    public static void main(String[] args) {
        //

        //삼항 연산자 단독 사용
        int num1 = 10;
        int num2= -10;

        String result1 = (num1 > 0)? "양수다" : "양수가 아니다";
        String result2 = (num2 > 0)? "음수다" : "음수가 아니다";

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        //삼항 연산자 중첩 사용
        int num3 = 5;
        int num4 = 0;
        int num5 = -5;

        String result3 = (num3 > 0)? "양수다" : (num3 == 0)? "0이다" : "음수다";
        String result4 = (num4 > 0)? "양수다" : (num4 == 0)? "0이다" : "음수다";
        String result5 = (num5 > 0)? "양수다" : (num5 == 0)? "0이다" : "음수다";

    }
}
