/* 04_명시적 타입 변환 */
/* 01_문자열 타입으로 변환 */

// 1. String 생성자 함수를 new 연산자 없이 호출
console.log(String(10)); // "10"
console.log(String(NaN)); // "NaN"
console.log(String(Infinity)); // "Infinity"
console.log(String(true)); // "true"
console.log(String(false)); // "false"

// 2. Object.prototype.toString 메소드 사용
console.log((10).toString); // "10"
console.log(NaN.toString); // "NaN"
console.log(Infinity.toString); // "Infinity"
console.log(true.toString);
console.log(false.toString);

// 3. 문자열 연결 연산자 이용
