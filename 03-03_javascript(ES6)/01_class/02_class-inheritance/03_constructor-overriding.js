//생성자 오버라이딩
//클래스가 다른 클래스를 상속받고 constructor가 없는 경웅는 비어있는 constructor가 만들어진다
//생성자는 기본적으로 부모 constructor를 호출한다
//이때 부모 constructor에도 인수를 모두 전달하는데 클래스 자체 생성자가 엇는 경우엔 이런일이 모두 자동으로 일어난다.

class Animal {
  constructor(name, weight) {
    this.name = name;
    this.weight = weight;
  }
  eat(foodWeight) {
    this.weight += foodWeight;
    console.log(
      `${this.name}은 ${foodWeight}kg의 식사를 하고 ${this.weight}kg이 되었습니다`
    );
  }
  move(lostWeight) {
    if (this.weight > lostWeight) this.weight -= lostWeight;
    console.log(
      `${this.name}은 움직임으로 인해 ${lostWeight}kg 감량되어 ${this.weight}kg이 되었습니다`
    );
  }
}

class Deer extends Animal {
  constructor(name, weight, legLength) {
    super(name, weight);
    this.legLength = legLength;
  }
  hide(place) {
    console.log(`${this.name}은 ${place}에 숨습니다`);
  }
}
let deer = new Deer("사슴", 40, 1);
deer.hide("동굴안");
