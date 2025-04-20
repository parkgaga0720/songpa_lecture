/* 02_배열 고차 함수 */

// Array.prototype.sort : 배열을 정렬기준으로 정렬
let numbers = [];
for (let i = 0; i < 10; i++) {
  numbers[i] = Math.floor(Math.random() * 100) + 1;
}

console.log(numbers);
numbers.sort();
console.log(numbers);

// 숫자 오름차순 정렬
function compare(a, b) {
  if (a > b) return 1;
  if (a == b) return 0;
  if (a < b) return -1;
}

numbers.sort(compare);
console.log(numbers);

// 숫자 내림차순 정렬
numbers.sort((a, b) => b - a);
console.log(numbers);

// Array.prototype.forEach : for를 대체할 수 있는 고차함수
var arr = [1, 2, 3, 4, 5];
arr.forEach(function (item, index, array) {
  console.log(item);
  console.log(index);
  console.log(array);
});

arr.forEach((item) => console.log(item * 10));

// Array.prototype.map : 배열 요소 전체를 대상으로 콜백 함수 호출 후 반환 값들로 구성된 새로운 배열 반환
const types = [true, 1, "text"].map((item) => typeof item); // 배열의 각 요소의 데이터 타입을 구함
console.log(types);

const lengths = ["apple", "banana", "cat", "dog", "egg"].map(
  (item) => item.length
); // 배열의 각 문자열 요소의 길이를 구함
console.log(lengths);

// Array.prototype.filter : 배열 요소 전체를 대상으로 콜백 함수 호출 후 반환 값이 true인 요소로만 구성 된 새로운 배열 반환
const all = [1, 2, 3, 4, 5, 6, 7, 8, 9];
const odds = all.filter((item) => item % 2);
console.log(odds);

// Array.prototype.some : 배열 내 일부 요소가 콜백 함수의 테스트를 통과하는지 확인하여 그 결과를 boolean으로 반환
let result = [1, 5, 3, 2, 4].some((item) => item > 3);
console.log(result);

// Array.prototype.every : 배열 내 모든 요소가 콜백 함수의 테스트를 통과하는지 확인하여 그 결과를 boolean으로 반환
let result2 = [1, 5, 3, 2, 4].every((item) => item > 0);
console.log(result2);

// Array.prototype.find : 배열을 순회하며 각 요소에 대하여 인자로 주어진 콜백함수를 실행하여 그 결과가 참인 첫번째 요소를 반환
//                                 참인 요소가 존재하지 않는다면 undefined를 반환
// Array.prototype.findIndex : 배열을 순회하며 각 요소에 대하여 인자로 주어진 콜백함수를 실행하여 그 결과가 참인 첫번째 요소의 인덱스를 반환
//                                         참인 요소가 존재하지 않는다면 -1을 반환
const student = [
  { name: "유관순", score: 90 },
  { name: "홍길동", score: 80 },
  { name: "장보고", score: 70 },
];

let result3 = student.find((item) => item.name === "유관순");
console.log(result3);
let result4 = student.find((item) => item.name === "신사임당");
console.log(result4);
let result5 = student.findIndex((item) => item.name === "유관순");
console.log(result5);
let result6 = student.findIndex((item) => item.name === "신사임당");
console.log(result6);
