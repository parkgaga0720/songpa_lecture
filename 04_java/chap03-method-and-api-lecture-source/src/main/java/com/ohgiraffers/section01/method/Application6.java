package com.ohgiraffers.section01.method;

public class Application6 {
    public static void main(String[] args) {
        //메소드 리턴값을 이해하고 활용할 수 있다.

        //메소드 리턴값 테스트
        //복귀를 할때 그냥 복귀를 할 수도 있지만, 값을 가지고 복귀할 수도 있다.
        //이때 가지고 가는 값을 리턴값이라고 한다.

        //매소드 리턴값 확인
        Application6 app6 = new Application6();
        app6.testMethod();

        String returnText = app6.testMethod();;
        System.out.println("returnText = " + returnText);

        System.out.println(app6.testMethod());
    }
    public String testMethod() {
        //public 뒤에 바로 return으로 가지고 가 타입을 명시한다.
        //아무것도 리턴하지 않는경우 void, 값을 반환하는 경우에는 반환 값의 자료형을 작성해야 한다.
        return "hello world";
    }
}
