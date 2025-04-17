/* 02_함수 표현식 */
var hello = function (name) {
  // 함수 이름 생략 가능하다.
  return `${name}님 안녕하세요!`;
};

console.log(hello("홍길동"));

// 함수 표현식에서 함수명을 생략하지 않아도 문제는 없다.
var calc = function add(a, b) {
  return a + b;
};

// 단, 함수 호출은 식별자로 이루어진다.
console.log(calc(10, 20));
// console.log(add(10,20)); // 함수명으로 호출 불가능
