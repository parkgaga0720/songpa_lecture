package com.ohgiraffers.section03.overriding;

public class SuperClass {
    //오버라이딩에 대해 이해할 수 있다.
    //오버라이딩 성립 요건
    //1. 메소드의 이름이 동일해야 한다
    //2. 메소드의 리턴 타입이 동일해야 한다
    //3. 매개변수의 타입, 갯수, 순서가 동일해야 한다.

    public void method(int num){}

    private void privateMethod(){}

    public final void finalMethod(){}

    protected void protectedMethod(){}
}
