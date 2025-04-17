/* 02_null 병합 연산자 */
var test = null ?? "기본 값";
console.log(test);

// null 병합 연산자는 null, undefined가 아닐 경우 그대로 반환한다.
var value = "" ?? "기본 값";
console.log(value);
