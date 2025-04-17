//in 연산자 존재여부 확인

var student = {
  name: "유관순",
  age: 16,
  test: undefined,
};

console.log(student.name === undefined);
console.log(student.height === undefined);
console.log(student.test === undefined); //프로퍼티는 존재하지만 존재하지 않음으로 판별되는 문제

console.log("name" in student);
console.log("height" in student);
console.log("test" in student);
