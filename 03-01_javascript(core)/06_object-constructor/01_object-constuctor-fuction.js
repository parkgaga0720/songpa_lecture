//객체 생성자 함수

//new 연산자 함께 object생성자 함수를 호출하면 빈객체를 생성하여 반환한다
//빈 객체 생성 이후 프로퍼티 또는 메소드를 추가하여 객체를 완성할 수 있다.

const student = new Object();
// 빈 객체 생성
student.name = "홍길동";
// 프로퍼티 추가
student.age = 16;

console.log(student);
