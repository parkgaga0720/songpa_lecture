/* 동적타입 언어 */

var test;
console.log(typeof test);

test = 1;
console.log(typeof test);

test = "Javascript";
console.log(typeof test);

test = true;
console.log(typeof test);

test = null;
console.log(typeof test);

test = Symbol();
test = {}; //객체리터럴
test = []; //배열

test = function () {};
console.log(typeof test);
