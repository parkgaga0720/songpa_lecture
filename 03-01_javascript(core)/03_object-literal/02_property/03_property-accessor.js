//프로퍼티 접근

var dog = {
  name: "뽀삐",
  eat: function (food) {
    console.log(`${this.name}는 ${food}를 맛있게 먹어요`);
  },
};

//마침표 표기법
dog.eat("고구마");
console.log(dog.name);

//대괄호 표기법
dog["eat"]("고구마");
console.log(dog["name"]);

//특수기호가 있으면 대괄호 표기법만 접근이 가능하다.
var obj = {
  "dash-key": "dash-value",
  0: 1,
};

//console.log(obj.dash-key);
conssole.log(obj["dash-key"]);
