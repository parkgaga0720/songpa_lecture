package practice;

public class practice04 {

public static void main(String[] args) {
/*4.

두 개의 정수형 변수를 선언하고, 삼항 연산자를 사용하여
두 수 중 큰 수를 출력하는 프로그램을 작성하세요.

    -- 출력예시 --
    두 수 중 큰 수는 20입니다.*/

    int a = 10;
    int b = 20;

    String result = (a > b) ? "두 수 중 큰 수는 " + a + "입니다" : "두 수 중 큰 수는 " + b + "입니다";

    System.out.println(result);
}
}
