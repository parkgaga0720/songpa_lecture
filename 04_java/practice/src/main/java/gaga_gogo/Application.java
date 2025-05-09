package gaga_gogo;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {


        /* 프로그램 개요
         *  가가(주인)가 고고(강이지)를 훈련하는 프로그램
         *
         *  시스템 요구사항
         *  1. 가가 [앉아, 기다려, 먹어, 산책 가자, 뛰어, 산책 끝]을 할 수 있다.
         *  2. 고고 [앉기, 기다리기, 먹기, 신나기, 뛰기, 시무룩하기]를 할 수 있다.
         *  3. 고고는 맨 처음 서있는다.
         *  4. 가가는 먼저 앉아 훈련한다. 이미 고고가 앉아있는 경우 다시 앉을 수 없다.
         *  5. 고고가 앉아 있는 경우 기다려, 산책 가자만 시킬 수있다.
         *  6. 고고가 기다리는 경우는 먹어, 산책 가자만 할 수 있다.
         *  7. 고고가 먹는 중이면 산책 갈자만 할수 있다.(이미 앉아서 기다리고 있음으로)
         *  8. 고고가 산책 중이면 가가는 뛰어, 산책 끝만 시킬 수 있다.
         *  9. 고고는 산책 중일때만 뛸 수 있다.
         * 10. 이미 뛰고 있는 상태에서 뛰어를 하면 고고의 속도가 올라간다.
         * */

        /* 프로그램 설계하기
         *  1. 필요한 객체 도출
         *  - 플레이어(사용자), 가가(주인), 고고(강아지)
         *
         *  2. 객체간 상호작용
         *  - 가가가 해야 하는 일
         *  1. 앉아 훈련하기
         *  2. 기다려 훈련하기
         *  3. 먹어 훈련하기
         *  4. 산책 가기
         *  5. 뛰기 훈련하기
         *  6. 산책 끝내기
         *
         *  - 고고가 해야 하는 일
         *  1. 앉기
         *  2. 기다리기
         *  3. 먹기
         *  4. 신나기
         *  5. 뛰기
         *  6. 시무룩하기
         * */

        Owner gaga = new Owner();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("======= 고고 훈련 프로그램 =======");
            System.out.println("1. 고고 앉아");
            System.out.println("2. 고고 기다려");
            System.out.println("3. 고고 먹어");
            System.out.println("4. 고고 산책 가자");
            System.out.println("5. 고고 뛰어");
            System.out.println("6. 고고 집에 가자");
            System.out.println("0. 훈련 종료");
            System.out.print("훈련 선택 : ");

            int no = sc.nextInt();

            switch (no) {
                case 1 :
                    gaga.gogoSit(); break;
                case 2 :
                    gaga.gogoWait(); break;
                case 3 :
                    gaga.gogoEat(); break;
                case 4 :
                    gaga.gogoWalk(); break;
                case 5 :
                    gaga.gogoRun(); break;
                case 6 :
                    gaga.gogoHome(); break;
                case 0 :
                    System.out.println("고고야 고생했어~"); break;
                default:
                    System.out.println("고고가 아직 배우지 못한 훈련입니다."); break;
            }

            //while 나가기
            if(no == 0) {
                break;
            }
        }
    }
}
