//다양한 사용법
//객체에 존재하지 않는 프로퍼티는 기본 값을 설정해서 사용할 수 있다.
//또한 콜론과 할당을 동시에 사용할 수 있다.

let shirts = {
  productName: "베이직 셔츠",
};

let {
  productName: productName2 = "어떤상품",
  color: color2 = "어떤색상",
  price: price2 = 0,
} = shirts;

console.log("productName2 : " + productName2);
console.log("color : " + color2);
console.log("price : " + price2);

let pants = {
  productName: "배기팬츠",
  color: "검정색",
  price: 3000,
};

//rest parameter ...로 나머지 요소를 한번에 가져올 수도 있따.
let { productName: productName4, ...rest } = pants;
console.log("productName24 : " + productName4);
console.log("color : " + rest.color);
console.log("price : " + rest.price);
