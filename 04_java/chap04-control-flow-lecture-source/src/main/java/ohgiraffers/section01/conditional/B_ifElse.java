package ohgiraffers.section01.conditional;

import java.util.Scanner;

public class B_ifElse {
    public void testSimpleIfElseStatement() {
        //if else문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다.
        //[if-else문 표현식]
        //if(조건식) {
        //    조건식이 true 일때 실행할 명령문;
        //} else {
        //    조건식이 false일때 실행할 명령문;
         //}

        //문제 3
        //정수 한개를 입력받아 그 수가 홀수이면 입력하신 숫자는 홀수입니다 라고 출력하고
        //홀수가 아니면 입력하신 숫자는 짝수입니다라고 출력하는 프로그램을 작성해보자
        //단 조건과 상관없이 프로그램이 종료될때 프로그램을 종료합니다 라고 출력되도록 한다.

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 하나를 입력하세요 : ");
        int num = sc.nextInt();

        if (num % 2 != 0){
            System.out.println("입력하신 숫자는 홀수입니다");
        } else {
            System.out.println("입력하신 숫자는 짝수입니다");
        }
        System.out.println("프로그램을 종료합니다");
    }

    public void testNestedIfElseStatement() {
        //중첩된 if else문의 흐름을 이ㅏ해하고 적용할 수 있다.

        //문제 4
        //정수 한개를 입력받아 그 수가 양수이면 입력하신 숫자는 양수입니다 라고 출력하고
        //음수면 입력하신 숫자는 음수입니다 출력하는 프로그램을 작성해보자
        //단 0이면 0입니다라고 출력되도록 한다.
        //단 조건과 상관없이 프로그램이 종료될때 프로그램을 종료합니다 라고 출력되도록 한다.

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 하나를 입력하세요 : ");
        int num = sc.nextInt();

        if(num != 0) {
            if (num > 0) {
                System.out.println("입력하신 숫자는 양수입니다");
            } else {
                System.out.println("입력하신 숫자는 음수입니다.");
            }
        } else {
            System.out.println("입력하신 숫자는 0입니다");
        /*
        if (num > 0){
            System.out.println("입력하신 숫자는 양수입니다");
        } else if (num == 0) {
            System.out.println("입력하신 숫자는 0입니다");
        } else {
            System.out.println("입력하신 숫자는 음수입니다");
        }
        System.out.println("프로그램을 종료합니다");
        */
        }
    }
}
