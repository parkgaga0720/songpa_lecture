package com.ohgiraffers.section02.packge_and_import;

public class Application1 {
    public static void main(String[] args) {
        //패키지에 대해 이해할 수 있다.
        //서로 관련있는 클래스 또는 인터페이스 드을 모아 하나의 묶음을 단위를 구성하는 것을 말한다.
        //같은 패키지 내에서는 동일한 이름의 클래스를 만들 수 없지만, 패키지가 다르면 동일한 이름을 가진 클래스를 만들 수 있다.
        //클래스 명은 원래 패키지를 포함하고 있기 때문이다.

        //non-static 메소드의 경우
        com.ohgiraffers.section01.method.Calculator calc = new com.ohgiraffers.section01.method.Calculator();
        int min = calc.minNumberOf(30,20);

        System.out.println(min);

        //static 메소드의 경우
        int max = com.ohgiraffers.section01.method.Calculator.maxNumberOf(30,20);;

        System.out.println(max);
    }
}
