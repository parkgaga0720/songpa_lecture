//메소드 오버라이딩
//부모 메소드 전체를 교체하지 않고 부모 메소드 토대로 일부 기능만 변경하고 싶을 때
//부모 메소드의 기능을 확장하고 싶을 때 메소드 오버라이딩을 사용한다.

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

class Tiger extends Animal {
  attack(target) {
    console.log(`${this.name}은 ${target}을 공격합니다`);
  }
  move(target) {
    //super을 통해 부모 클래스에 메소드를 참조한다.
    super.move(0.1);
    this.attack(target);
  }
}

let tiger = new Tiger("백두산 호랑이", 90);
tiger.move("사슴");
