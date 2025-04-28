package com.ohgiraffers.section01.method;

import static com.ohgiraffers.section01.method.Calculator.maxNumberOf;

public class Application9 {
    public static void main(String[] args) {
        //다른 클래스에 작성한 메소드를 호출할 수 있다.

        int first = 100;
        int second = 50;

        //non-static 메소드의 경우
        Calculator calc = new Calculator();
        int min = calc.minNumberOf(first, second);
        System.out.println("두 수 중 최소값은 : " + min);

        int max = Calculator.maxNumberOf(first, second);
        System.out.println("두 수 중 최대값은 : " + max);

        //주의사항
        //static 메소드도 non-static 메소드처럼 호출가능하지만 권장하지 않는다.
        //이미 메모리에 로링되어 있는 메소드는 여러 객체가 공유하게 되는데 이때 객체로 접근하게 되면
        //인스턴스가 가진 값으로 공유된 값이 예상치 못하는 동작을 유발할 수 있기 때문이다,
        //시스템이 복잡해 질 수로 객체의 상태를 추적하기 어려워 유지보수에 악영향ㅇㄹ 준다.
        int max2 = calc.maxNumberOf(first, second);

        //stacic 메소드의 경우
        //다른 클래스에 작성한 static 메소드의 경우 호출할 때 클래스명을 반드시 기술해야 한다.
        int max3 = maxNumberOf(first, second);
    }

}
