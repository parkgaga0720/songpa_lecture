//02. 클래스 표현식

//1. 익명 클래스 표현식
let Tutor = class {
  teach() {
    console.log("안녕하세요?");
  }
};

new Tutor().teach();

//기명 클래스 표현식

let Tutee = class MyTutee {
  learn() {
    console.log("자바스크리트 es6");
  }
};

new Tutee().learn();

//글래스 동적 생성

function makeTutee(message) {
  return class {
    feedback() {
      console.log(message);
    }
  };
}

let SecondTutee = makeTutee('메시지');
new SecondTutee().feedback();