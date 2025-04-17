/* 02_숫자타입으로 변환 */
console.log(10 - "5"); //5
console.log(10 * "5"); //50
console.log(10 % "javascript"); //NaN

// 비교 연산자로 크기를 비교하기 위해 모두 숫자타입이여야 하므로
// 숫자가 아닌 피연산자를 숫자 타입으로 암묵적 타입 변환한다.
console.log(10 > "5");

console.log(+""); // 0
console.log(+"1"); // 1
console.log(+"javascript"); //NaN
console.log(+true); // 1
console.log(+false); // 0
console.log(+null); // 0
console.log(+undefined); //NaN
// console.log(+Symbol());
console.log(+{}); //NaN
console.log(+[]); // 0 -> 빈 배열만 숫자로 바꿀 수 있음
console.log(+[1, 2, 3]); // NaN
console.log(+function () {}); //NaN
