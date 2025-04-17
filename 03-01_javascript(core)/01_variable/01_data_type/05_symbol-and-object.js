/* 05_symbol and object */
//심벌값 생성
var key = Symbol("key");
console.log(key);
//객체 생성
var obj = {};
obj[key] = "value";
console.log(obj[key]);
