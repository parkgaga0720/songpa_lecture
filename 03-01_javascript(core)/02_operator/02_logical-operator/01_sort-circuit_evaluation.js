/* 01_논리연산자 - 단축 평가 */

console.log("apple" || "banana");
console.log(false || "banana");

console.log("apple" && "banana");
console.log(false && "banana");
console.log("apple" && false);

var num = 1;
if (num % 2 == 0) console.log("짝수입니다");
else console.log("홀수입니다");

// 위를 단축평가를 활용하여 바꿔본다.
num % 2 == 0 && console.log("짝수입니다.");
num % 2 == 0 || console.log("홀수입니다.");
