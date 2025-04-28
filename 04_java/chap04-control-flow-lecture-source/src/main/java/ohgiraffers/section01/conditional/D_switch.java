package ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D_switch {
    public void testSimpleSwitchStatement() {
        //switch 단독사용에 대한 흐름을 이해햐고 적용할 수 있다.
        //[switch 표현식]
        //switch(비교할 변수) {
        //      case 비교값1 : 비교값1과 일치하는 경우 실행할 구문; break;
        //      case 비교값2 : 비교값2과 일치하는 경우 실행할 구문; break;
        //      case 비교값3 : 비교값3과 일치하는 경우 실행할 구문; break;
        //      default : case에 모두 해당하지 않는 경우 실행하 구문; break;

        //문제 7
        //정수 두개와 연산 기호 문자를 입력 받아서
        //두수의 연산결과를 출력해보는 간단한 계산기를 만들어보자

        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 정수 입력 : ");
        int first = sc.nextInt();
        System.out.println("두번째 정수 입력 : ");
        int second = sc.nextInt();
        System.out.println("연산 기호 입력(+,-,*,/,%) : ");
        char op = sc.next().charAt(0);

        switch (op) {

            case '+':
                System.out.println(first + second);
                break;
            case '-':
                System.out.println(first - second);
                break;
            case '*':
                System.out.println(first * second);
                break;
            case '/':
                System.out.println(first / second);
                break;
            case '%':
                System.out.println(first % second);
                break;

            //산술 연산 외에 다른 문자에 대한 처리는 생략하였음
        }
    }

        public void testSwitchVendingMachine(){
            //switch문을 이용해서 문자열 값 비교 및 break 테스트
            System.out.println("==========ohfiraffers vending machine============");
            System.out.println("apple    banana    orange    melon    grape    ");
            System.out.println("=================================================");
            System.out.println("과일을 선택해주세요 : ");

            Scanner sc1 = new Scanner(System.in);
            String selectdFruits = sc1.nextLine();

            int price = 0;

            String order = "";

            switch (selectdFruits) {
                case "apple":
                    order = "apple";
                    price = 1000;
                    break;
                case "banana":
                    order = "banana";
                    price = 1500;
                    break;
                case "orange":
                    order = "orange";
                    price = 2000;
                    break;
                case "melon":
                    order = "melon";
                    price = 2500;
                    break;
                case "grape":
                    order = "grape";
                    price = 10000;
                    break;
            }
            System.out.println(order +"를 선택하셨습니다");
            System.out.println(price + "원을 투입하세요");
        }
    }
