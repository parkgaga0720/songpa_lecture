package com.ohgiraffers.section01.method;

public class Application8 {
    public static void main(String[] args) {
        //static 메소드를 호출할 수 있다.
        //siatic 메소드를 호출하는 방법
        // 클래스명.메소드명()

        Application8.sumTwoNumbers(10,20);
        sumTwoNumbers(10,20); // 동일한 클래ㅡ 일때 클래스명 생략가능

    }
    public static int sumTwoNumbers(int first, int second) {
        return first + second;
    }
}
