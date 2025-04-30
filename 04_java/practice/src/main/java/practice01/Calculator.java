package practice01;

public class Calculator {
    /*
+ checkMethod():void                    // 함수 호출 확인용 메소드
+ sum1to10():int                        // 1부터 10까지 수를 더하여 값을 리턴함
+ checkMaxNumber(a:int, b:int):void     // 두 수를 입력받아 큰 수를 출력함
+ sumTwoNumber(a:int, b:int):int        // 두 수를 입력받아 합을 리턴함
+ minusTwoNumber(a:int, b:int):int      // 두 수를 입력받아 차를 리턴함
*/
    public void checkMethod(){
        System.out.println("메소드 호출 확인");
    }
    public int sum1to10(){
        int sum = 0;
        for(int i = 1; i <= 10; i++){
            sum += i;
        }
        return sum;
    }
    public void checkMaxNumber(int a, int b){
        String result = (a > b) ? "두 수 중 큰 수는 " + a + "이다" : "두 수 중 큰 수는 " + b + "이다";
        System.out.println(result);
    }
    public int sumTwoNumber(int a, int b){
        int result = a + b;
        return result;
    }
    public int minusTwoNumber(int a, int b){
        int result = a - b;
        return result;
    }

}
