package practice;

import java.util.Scanner;

public class practice14 {
    public static void main(String[] args) {
        //반복문을 사용하여 7단 구구단을 출력하세요.

        int dan = 7;
        for(int su = 1; su <= 9; su++) {
            System.out.println(dan + " * " + su + " = " + (dan * su));
        }
    }
}
