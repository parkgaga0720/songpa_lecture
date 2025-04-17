//프로퍼티 값 단축 구문
var id = "p-0001";
var price = 30000;

var product = {
  id: id,
  price: price,
};

console.log(product);

//변수 이름과 프로퍼티 키가 동일한 이름일때 프로퍼티 키를 생략할 수 있다.
var product2 = { id, price };
console.log(product2);
