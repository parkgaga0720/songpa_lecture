/*
1. 

사용자가 입력한 숫자가 홀수인지 짝수인지 판별하는 함수를 작성하세요.

(if - else 문 이용하기)
*/

function OddNumber(number) {
  if (number % 2 === 0) {
    return `${number} : 짝수`;
  } else {
    return `${number} : 홀수`;
  }
}

console.log(OddNumber(3));
console.log(OddNumber(6));
