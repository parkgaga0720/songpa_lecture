//중첩 함수

function outer() {
  var outerVal = "외부 함수";
  function inner() {
    var innerVal = "내부 함수";
    console.log(innerVal);
    //외부 함수의 변수를 참조할 수 있다.
    console.log(outerVal);
  }
  inner();
}
outer();
//inner(); 에러
