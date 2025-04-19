// [[Prototype]] 자바스크립트의 객체는 숨김 프로퍼티를 갖는다. 이 프로퍼티 값은 null이거나 다른 객체에 대한 참조가 되는데, 다른 객체에 참조하는 경우 참조 대상을 프로토타입이라 부른다.

const user = {
  activate: true,
  login: function () {
    console.log("로그인 되었습니다.");
  },
};

const student = {
  passion: true,
};

student.__proto__ = user;
console.log(student.activate);
student.login();
console.log(student.passion);

//프로토타입 체인
const ohgirafferStudent = {
  class: 11,
  __proto__: student,
};

console.log(ohgirafferStudent.activate); //user 상속
console.log(ohgirafferStudent.passion); //student 상속

//프로토타입 체이님은 순환참조가 허용되지 않는다.
//__proto__ 값은 객체 또는 null만 가능하며 다른 자료형은 무시된다.
