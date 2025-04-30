package practice02;

import java.util.Scanner;

public class SimpleOperations {
    /*
+ printMessage():void                         // 함수 호출 확인용 메소드
+ sumNumbers(start:int, end:int):int          // start부터 end까지의 숫자들의 합을 리턴함
+ isEvenNumber(num:int):boolean               // 주어진 숫자가 짝수이면 true, 아니면 false를 리턴함
+ countCharacter(input:String, ch:char):int   // 주어진 문자열에서 특정 문자의 개수를 리턴함
+ reverseString(input:String):String          // 주어진 문자열을 뒤집어서 리턴함
*/
    public void printMessage(){
        System.out.println("메소드 호출 확인");
    }
    public int sumNumbers(int start, int end){
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }
    public boolean isEvenNumber(int num){
        if(num % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
    public int countCharacter(String input, char ch){
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
    public String reverseString(String input){
        return new StringBuilder(input).reverse().toString();
    }
}
