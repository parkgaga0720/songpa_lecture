package practice;

import org.w3c.dom.ls.LSOutput;

public class practice03 {
    public static void main(String[] args) {
        /*3.

    국어점수 80.5점, 수학점수 50.6점, 영어점수 70.8점을 실수 형태로 저장한 뒤,
    총점과 평균을 정수 형태로 출력하세요.

    -- 출력 예시 --
    총점 : 201
    평균 : 67*/

        double korean = 80.5;
        double math = 50.6;
        double english = 70.8;

        int sum = (int) (korean + math + english);
        int average = sum / 3;

        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + average);
    }

}
