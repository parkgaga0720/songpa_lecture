// 생성자 함수

//객체 리터럴
const student1 = {
  name: "유관순",
  age: 20,
  getInfo: function () {
    return `${this.name}(은)는 ${this.age}세입니다.`;
  },
};

const student2 = {
  name: "홍길동",
  age: 20,
  getInfo: function () {
    return `${this.name}(은)는 ${this.age}세입니다.`;
  },
};

//생성자 함수에 의한 객체 생성 -> 동일한 객체 여러개 간편하게 생성할 수 있다.
function Student(name, age) {
  //생성자 함수 내부의 this는 생성자 함수가 생성할 인스턴스를 가리킨다.
  this.name = name;
  this.age = age;
  this.getInfo = function () {
    return `${this.name}(은)는 ${this.age}세입니다.`;
  };
}
const student3 = new Student("장보고", 30); // 인스턴스의 생성
const studen4 = new Student("신사임당", 40); // 인스턴스의 생성
console.log(student3.getInfo()); // 메서드 호출
