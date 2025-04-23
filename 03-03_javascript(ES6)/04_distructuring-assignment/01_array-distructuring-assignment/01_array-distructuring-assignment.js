//배열 구조 분해 할당
//구조 분해 할당을 사용하면 배열이나 객체를 변수를 분해하여 연결할 수 있다.

//기본문법
let nameArr = ["Gildong", "Hong"];
let [firstName, lastName] = nameArr;

console.log(firstName);
console.log(lastName);

//반환 값이 배열인 split 메소드를 활용한 예제
let [firstName2, lastName2] = "Saimdang Shin".split(" ");

console.log(firstName2);
console.log(lastName2);

//쉼표를 사용하여 필요하지 않은 배열 요소를 버릴 수 있다.
let [firstName3, , lastName3] = ["firstName", "middleName", "lastName"];

console.log(firstName3);
console.log(lastName3);
