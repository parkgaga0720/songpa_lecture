//함수의 매개변수가 많거나 매개변수 기본 값이 필요한 경우
//function displayProduct(producer = "아무개", width = 0, height = 0, items=[]){}
//displayProduct('신사임당', undifined, undifined, ["coffee", "donut"]);

//위를 구조분해 할당을 이용하면 문제점이 해결된다.

function displayProduct({
  producer = "아무개",
  width = 10,
  height = 20,
  items = [],
}) {
  console.log(producer, width, height);
  console.log(items);
}

//함수에 전달할 객체
let exampleProduct = {
  items: ["coffee", "donut"],
  producer: "신사임당",
};

displayProduct(exampleProduct);
