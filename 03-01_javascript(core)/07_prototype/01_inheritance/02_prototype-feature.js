//프로토타입 틑ㄱ징

const user = {
  id: "user",
  login: function () {
    console.log(`${this.id}님 로그인 되었습니다.`);
  },
};

const student = {
  __proto__: user,
};

student.id = "user01";
//메소드는 공유되지만 객체의 상태는 공유되지 않는다.

student.login();

for (let prop in student) {
  //for in 반복문은 상속 프로퍼티도 순회 대상에 포함시킨다.
  console.log(prop);

  let isOwn = student.hasOwnProperty(prop);

  if (isOwn) {
    console.log(`객체 자신의 프로퍼티 ${prop}`);
  } else {
    console.log(`상속 프로퍼티 ${prop}`);
  }
}
