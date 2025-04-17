// var

//1. 변수 중복 선언 허용
var msg = "안녕하세요";
console.log(msg);

//자바스크립트 엔진에 의해 초기화 된다.
var msg = "안녕히가세요";
console.log(msg);

var msg;
console.log(msg);

//함수레벨 스코프

//변수 호이스팅
console.log(test); // 변수는 이미 선언되었고 undefined로 초기화 되었다.
var test = "반갑습니다"; // 변수 선언은 런타임 이전에 암묵적으로 실행 된다.
console.log(test);
