//화살표 함수의 특징
//화살표 함수 기존함수보다 표현만 간략한 것이 아니라 내부 동작 또한 간략화 되어있다
//일반함수와의 차이점을 알아보자

//1. 화살표 함수는 this를 가지지 않는다.

let theater = {
  store: "건대점",
  titles: ["어벤저스", "겨울왕국", "스파이더맨", "라이온킹", "알라딘"],

  showMoveList() {
    this.titles.forEach(
      //본문에서 this에 접근하면 외부에서 값을 가져온다.
      (title) => console.log(this.store + ":" + title)
    );
  },
};

theater.showMoveList();

//화살표 함수는 new와 함께 호출 할 수 없다.
const arrowFunc = () => {};
//화살표 함수는 인스턴스를 생성할수 없없으므로 prototype 프로퍼티가 없고 프로토 타입도 생성하지 않는다.
console.log(arrowFunc.hasOwnProperty("prototype"));

//화살표 함수는 super를 가지지 않는다.
class Animal {
  constructor(name, weight) {
    this.name = name;
    this.weight = weight;
  }
  move(lostWeight) {
    if (this.weight > lostWeight) this.weight -= lostWeight;
    console.log(
      `${this.name}은 움직임으로 인해 ${lostWeight}kg 감량되어 ${this.weight}kg이 되었습니다`
    );
  }
}

class Tiger extends Animal {
  move(lostWeight) {
    //화살표 함수는 super를 지원하지 않아 super를 외부함수에서 가져오기 때문에 Animal의 move()호출이 가능하다.
    setTimeout(() => super.move(lostWeight), 1000);
    console.log("먹이를 찾아 어슬렁");
  }
}

let tiger = new Tiger("백두산 호랑이", 90);
tiger.move(1);
