//프로퍼티값 변경, 추가, 삭제

var dog = {
  name: "뽀삐",
};

//이미 존재하는 프로퍼티에 값을 할당하면 프로퍼티 값이 갱신된다.
dog.name = "두부";
dog["name"] = "두부";
console.log(dog);

//프로퍼티 동적 추가
dog.age = 3;
console.log(dog);

//프로퍼티 삭제
//존재하지 않는 프로퍼티를 삭제하면 에러없이 무시된다.
delete dog.age;
console.log(dog);
