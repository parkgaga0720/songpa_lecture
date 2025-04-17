/* 03_화살표 함수 */
var message;

// 기존 함수 정의
message = function () {
  return "hello world";
};

console.log(message());

// function 생략 가능
message = () => {
  return "Arrow Function!";
};

// 명령문이 하나만 있는 경우 중괄호, return 생략 가능
message = () => "Arrow Functions are Simple";

console.log(message());

// 매개변수 있을 경우
message = (val1, val2) => `arrow function : ${val1 + val2}`;

console.log(message(10, 20));

// 매개변수가 하나면 소괄호 생략 가능
message = (value) => `hello${value}`;

console.log(message("world"));
