//객체 구조 문해 할당

//기본 문법

let pants = {
  productName: "배기팬츠",
  color: "검정색",
  price: 3000,
};

let { productName, color, price } = pants;

console.log(productName);
console.log(color);
console.log(price);

let { color: co, price: pr, productName: pn } = pants;
console.log(pn);
console.log(co);
console.log(pr);
