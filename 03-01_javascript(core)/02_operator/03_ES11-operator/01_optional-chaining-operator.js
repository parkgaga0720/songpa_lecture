/* 01_옵셔널 체이닝 연산자 */
var obj = null;
// var val = obj.value;
var val = obj?.value;
console.log(val);

var str = "";
var len = str && str.length;
console.log(len);

var len = str?.length;
console.log(len);
