package practice;

import org.w3c.dom.ls.LSOutput;

public class practice05 {
    public static void main(String[] args) {
        /*5.

정수형 변수를 선언하여 점수를 저장하고,
삼항 연산자를 사용하여 점수가 60점 이상이면 “합격입니다”,
그렇지 않으면 “아쉽지만 불합격입니다.” 을 출력하는 프로그램을 작성하세요.

    -- 출력예시 --
    합격입니다~~!!!

    또는 아쉽지만 불합격입니다…*/

        int point = 70;
        String result = (point >= 60) ? "합격입니다~~!!!" : "아쉽지만 불합격입니다…";

        System.out.println(result);
    }
}
