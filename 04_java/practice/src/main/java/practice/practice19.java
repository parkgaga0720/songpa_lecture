package practice;

import java.util.Scanner;

public class practice19 {
    public static void main(String[] args) {
        /*정수형 변수 두 개를 선언하고, 사용자로부터 각각 값을 입력받은 후,
다음 연산을 순서대로 출력하세요.

첫 번째 반복: 더하기

두 번째 반복: 빼기

세 번째 반복: 곱하기

네 번째 반복: 나누기(몫)

다섯 번째 반복: 나누기(나머지)

단, 나눗셈과 나머지 연산 시 0으로 나누는 경우 "0으로 나눌 수 없습니다"라는 메시지를 출력하도록 처리하세요.

-- 출력 예시 --
=============================
첫 번째 정수를 입력하세요: 20
두 번째 정수를 입력하세요: 30
더하기 결과 : 50
빼기 결과 : -10
곱하기 결과 : 600
나누기한 몫 : 0
나누기한 나머지 : 20
==============================
*/

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력하세요: ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 정수를 입력하세요: ");
        int num2 = sc.nextInt();

        /*for (int i = 1; i <=5; i++) {
            if(i == 1){
                System.out.println("더하기 결과 : " + (num1 + num2));
            }
            if(i == 2){
                System.out.println("빼기 결과 : " + (num1 - num2));
            }
            if(i == 3){
                System.out.println("곱하기 결과 : " + (num1 * num2));
            }
            if(i == 4){
                if(num2 != 0) {
                    System.out.println("나누기한 몫 : " + (num1 / num2));
                }else {
                    System.out.println("0으로 나눌 수 없습니다");
                }
            }
            if(i == 5){
                if(num2 != 0) {
                    System.out.println("나누기한 나머지 : " + (num1 % num2));
                }else{
                    System.out.println("0으로 나눌 수 없습니다");
                }
            }
        }*/

        for(int i = 1; i <=5; i++){
            switch (i){
                case 1:
                    System.out.println("더하기 결과 : " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("빼기 결과 : " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("곱하기 결과 : " + (num1 * num2));
                    break;
                case 4:
                    if(num2 != 0) {
                        System.out.println("나누기한 몫 : " + (num1 / num2));
                    }else {
                        System.out.println("0으로 나눌 수 없습니다");
                    }
                    break;
                case 5:
                    if(num2 != 0) {
                        System.out.println("나누기한 나머지 : " + (num1 % num2));
                    }else{
                        System.out.println("0으로 나눌 수 없습니다");
                    }
                    break;
            }
        }
    }
}
