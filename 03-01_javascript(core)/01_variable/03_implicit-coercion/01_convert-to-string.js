/* 03_암묵적 타입 변환 
개발자가 의도적으로 값의 타입을 변환하는 것을 명시적 타입 변환이라고 하며
자바스크립트 엔진에 의해 암묵적으로 타입이 자동 변환되는 것을 암묵적 타입 변환이라고 한다.
*/

/* 01_문자열 타입으로 변환 */
console.log(10 + "20");

// 표현식의 결과를 문자열 타입으로 암묵적으로 변환
console.log(`10 + 20 : ${10 + 20}`);

console.log(1 + ""); // "1"
console.log(NaN + ""); // "NaN"
console.log(Infinity + "");
console.log(true + "");
console.log(null + "");
console.log(undefined + "");
// console.log(Symbol() + "");
console.log({} + "");
console.log([] + "");
console.log(function () {} + "");
