//for in 반복문 객체의 모든키 순회

var student = {
  name: "유관순",
  age: 16,
  getInfo: function () {
    return `${this.name}은 ${this.age}세 입니다`;
  },
};

for (var key in student) {
  console.log(key);
  console.log(student[key]);
}
