/* 
01. 클래스 기본 문법 
동일한 종류의 객체를 여러 개 생성해야 하는 경우 객체 리터럴을 여러 개 생성하기 보다,
클래스 문법을 통해 동일한 종류의 객체를 재생성할 수 있다.
*/

// 01. 클래스 선언
class Student {
  // 생성자를 통해 인스턴스 생성 및 초기화
  constructor(name) {
    this.group = 1; // 고정 값으로 인스턴스 초기화
    this.name = name;
  }

  // 프로토타입 메소드
  introduce() {
    console.log(`안녕하세요 저는 ${this.group}반 학생 ${this.name} 입니다.`);
  }
}

let student = new Student("홍길동");
student.introduce();

console.log(typeof Student); // 클래스는 함수의 한 종류이다.
console.log(Student === Student.prototype.constructor);
console.log(Student.prototype.introduce);
console.log(Object.getOwnPropertyNames(Student.prototype));

/* 
정리하면, new Student()를 호출하면 Student라는 이름을 가진 함수를 만들고
함수 본문은 생성자 메소드 constructor에서 가져온다.
만약 생성자 메소드가 없으면 본문이 비워진 채로 함수가 만들어진다.
introduce와 같이 클래스 내에서 정의한 메소드는 Student.prototype에 저장한다.
*/

/* 클래스 문법과 유사하게 기능 하는 것처럼 보이는 생성자 함수를 사용할 수도 있다*/

function Teacher(name) {
  this.group = 1;
  this.name = name;
}

Teacher.prototype.introduce = function () {
  console.log(`안녕하세요 저는 ${this.group}반 교사 ${this.name} 입니다.`);
};

let teacher = new Teacher("유관순");
teacher.introduce();
