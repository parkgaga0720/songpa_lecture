package practice;

public class practice12 {
    public static void main(String[] args) {
        //반복문을 사용하여 1부터 100까지 더한 합계를 출력하세요.
        int sum = 0;
        for(int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("1부터 100까지 더한 값 : " + sum);
    }
}
