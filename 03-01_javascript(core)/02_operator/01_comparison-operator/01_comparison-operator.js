/* 01_비교 연산자 */

/* 동등/일치 비교 연산자 */

// 숫자 1, 문자 '1', true 비교
console.log(`1 == '1' : ${1 == "1"}`);
console.log(`1 == true : ${1 == true}`);

console.log(`1 === '1' : ${1 === "1"}`);
console.log(`1 === true : ${1 === true}`);

// 숫자 0, 문자 '0', 빈 문자열 '', false 비교
console.log(`0 == '0' : ${0 == "0"}`);
console.log(`0 == '' : ${0 == ""}`);
console.log(`0 == false : ${0 == false}`);

console.log(`0 === '0' : ${0 === "0"}`);
console.log(`0 === '' : ${0 === ""}`);
console.log(`0 === false : ${0 === false}`);

// null, undefined 비교
console.log(`null == undefined : ${null == undefined}`);
console.log(`null === undefined : ${null === undefined}`);

// NaN은 자신과 일치하지 않은 유일한 값이다.
console.log(`NaN == NaN : ${NaN == NaN}`);
console.log(`NaN === NaN : ${NaN === NaN}`);

// 일치 비교 연산자
console.log(`'hello' === 'hello' : ${"hello" === "hello"}`);
console.log(`'hello' !== 'hello' : ${"hello" !== "hello"}`);

// 대소 비교 연산자
console.log(`'apple' < 'banana' : ${"apple" < "banana"}`);
console.log(`'cat' >= 'Zoo' : ${"cat" >= "Zoo"}`); // 대문자가 소문자보다 작다
