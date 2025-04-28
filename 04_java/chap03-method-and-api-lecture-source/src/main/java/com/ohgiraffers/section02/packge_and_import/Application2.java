package com.ohgiraffers.section02.packge_and_import;

import com.ohgiraffers.section01.method.Calculator;

import static com.ohgiraffers.section01.method.Calculator.maxNumberOf;

public class Application2 {
    public static void main(String[] args) {
        //import에 대해 이해할 수 있다,

        //임포트란?
        //패키지명을 생략하고 사용할 수 있도록 한 구문이 import이다.
        // import는 패키지 선언문과 클래스 선언문 사이에 작성하며
        // 어떠한 패키지 내에 있는 클래스를 사용할 것인지 미리 선언하는 효과를 가진다.

        //non-static 메소드인 경우
        Calculator calc = new Calculator();
        int min = calc.minNumberOf(50,60);

        System.out.println(min);

        //siatic 메소드인 경우
        int max = Calculator.maxNumberOf(50,60);
        System.out.println(max);

        //static 메소드를 호출할때 클래스 명도 생략하고 사용
        int max2 = maxNumberOf(50,60);
        System.out.println(max2);

    }
}
