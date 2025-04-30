package practice02;

public class Application {
    public static void main(String[] args) {

        SimpleOperations s = new SimpleOperations();
        // 메소드 호출 확인용 메소드 호출
        s.printMessage();
        // start부터 end까지의 숫자들의 합을 출력하는 메소드 호출
        int sum = s.sumNumbers(1,10);
        System.out.println("1부터 10까지의 숫자들의 합은 : " + sum);
        // 주어진 숫자가 짝수인지 판별하는 메소드 호출 후 결과 출력
        boolean even = s.isEvenNumber(10);
        if(even){
            System.out.println("10은 짝수입니다.");
        }else{
            System.out.println("10은 짝수가 아닙니다.");
        }
        // 주어진 문자열에서 특정 문자의 개수를 출력하는 메소드 호출
        int result = s.countCharacter("Hello World", 'o');
        System.out.println("'Hello World'에서 'o'의 개수는 : " + result);
        // 주어진 문자열을 뒤집은 결과를 출력하는 메소드 호출
        String str = s.reverseString("Hello World");
        System.out.println("'Hello World'를 뒤집은 결과는 : " + str);
    }
}
