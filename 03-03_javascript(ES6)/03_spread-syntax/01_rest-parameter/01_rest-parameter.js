//나머지 매개변수

function merge(msg1, msg2) {
  return msg1 + msg2;
}

//함수에 정의된 인수는 2개이고 정해진 인수보다 적게 전달하면 undefined, 정해진 인수보다 많이 전달되면 해당인수를 무시하고 기능한다.
console.log(merge("안녕하세요"));
console.log(merge("안녕하세요", "반갑습니다"));
console.log(merge("안녕하세요", "반갑습니다", "제 이름은 홍길동 입니다"));

//이때 나머지 매개변수 ...를 사용하면 매개변수를 한 곳에 모야ㅏ 배열에 담을 수 있다.
function mergeAll(...args) {
  let message = "";
  for (let arg of args) message += arg;
  return message;
}

console.log(mergeAll("안녕하세요"));
console.log(mergeAll("안녕하세요", "반갑습니다"));
console.log(mergeAll("안녕하세요", "반갑습니다", "제 이름은 홍길동 입니다"));

//유의할점은 나머지 매개변수는 항상 마지막에 있어야 한다.
//fuction func(arg1, ...args, arg2) {} -> X
//fuction func(arg1, arg2, ...args) {} -> O