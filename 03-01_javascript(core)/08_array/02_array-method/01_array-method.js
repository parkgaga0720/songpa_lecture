/* 01_배열 메소드 */
const arr = [];
// 배열의 생성자 함수 Array
console.log(arr.constructor === Array);
// 배열의 프로토타입 객체는 Array.prototype
console.log(Object.getPrototypeOf(arr) === Array.prototype);

// Array.prototype.indexOf -> 앞에서부터 요소가 위치한 인덱스를 리턴한다.
const foodList = ["물회", "삼계탕", "냉면", "수박", "물회"];

console.log(foodList.indexOf("물회"));
console.log(foodList.indexOf("물회", 1));
console.log(foodList.indexOf("삼겹살"));

// Array.prototype.lastIndexOf -> 뒤에서부터 요소가 위치한 인덱스를 리턴한다.
console.log(foodList.lastIndexOf("물회"));
console.log(foodList.lastIndexOf("물회", 1));
console.log(foodList.lastIndexOf("삼겹살"));

// Array.prototype.includes -> 배열에 해당 요소 포함 여부를 리턴한다.
console.log(foodList.includes("물회"));
console.log(foodList.includes("삼겹살"));

// Array.prototype.push : 배열의 맨 뒤에 요소 추가
// Array.prototype.pop : 배열의 맨 뒤에 요소 제거
const chineseFood = ["짜장면", "짬뽕", "우동"];

console.log(chineseFood);
chineseFood.push("탕수육");
chineseFood.push("양장피");

console.log(chineseFood);

chineseFood.pop();
chineseFood.pop();
chineseFood.pop();

console.log(chineseFood);

// Array.prototype.unshift : 배열의 맨 앞에 요소 추가
// Array.prototype.shift : 배열의 맨 앞에 요소 제거 후 반환
const chickenList = ["양념치킨", "후라이드", "파닭"];

console.log(chickenList);

chickenList.unshift("간장치킨");
chickenList.unshift("마늘치킨");

console.log(chickenList);

chickenList.shift();
chickenList.shift();
chickenList.shift();

console.log(chickenList);
