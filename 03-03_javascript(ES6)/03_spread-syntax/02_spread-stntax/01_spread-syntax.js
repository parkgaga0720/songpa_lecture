//스프레드 문법, 전개 문법
//rest parameter처럼 매개변수 목록을 배열로 가져오는 것과는 반대로 배열을 통채로 매개변수에 넘겨주는 기능이다.
//하나로 뭉쳐있는 여러 값들의 집합을 전개해서 개별적인 값들의 목록으로 만든다.

console.log("가장 큰 값 : " + Math.max(10, 30, 20));

let arr = [10, 30, 20];
console.log("가장 큰 값 : " + Math.max(arr)); // NaN
//함수를 호출할때 ...arr을 사용하면 arr이 인수목록으로 확장된다.
console.log("가장 큰 값 : " + Math.max(...arr));

let arr1 = [10, 30, 20];
let arr2 = [100, 300, 200];

//배열 객체 여러개 전달 가능
console.log("가장 작은 값 : " + Math.min(...arr1, ...arr2));

//일반 값과 혼합해서 사용가능
console.log("가장 작은 값 : " + Math.min(1, ...arr1, 2, ...arr2, 3));

//배열 병합에도 사용 가능 - concat보다 간결
let merged = [0, ...arr1, 2, ...arr2];
console.log(merged);

//이터러블 배열 변환
//스프레드 문법은 for ...of 와 같은 방식으로 내부에서 이터레이터(interator, 반복자)를 사용해 요소를 수집한다.
let str = "JavaScript";
console.log([...str]);
console.log(Array.from(str)); // 이터러블 객체 이외에도 무언가를 배열로 바꿀 때 보편적으로 사용한다.
