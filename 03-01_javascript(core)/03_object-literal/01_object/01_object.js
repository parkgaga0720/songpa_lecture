//객체

var student = {
  name: "유관순",
  age: 16,
  getinfo: function () {
    return `${this.name}은 ${this.age}세 입니다`;
  },
};
console.log(typeof student);
console.log(student);
console.log(student.getinfo());

//프로퍼티를 정의하지 않을 시 빈 객체가 생성된다.
var student = {};
console.log(typeof student);
console.log(student);
