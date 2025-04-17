// 재귀 함수

function factorial(n) {
  if (n <= 1) return 1; //n이 1이하면 재귀 호출을 멈춘다

  return n * factorial(n - 1);
}

console.log(factorial(1));
console.log(factorial(2));
console.log(factorial(3));
console.log(factorial(4));
console.log(factorial(5));
