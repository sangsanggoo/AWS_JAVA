
window.onload = () => {

}
// 함수를 변수에 넣어줄 수 있음
let a = function() {
    console.log("a 함수 호출");
}
a();

console.log(typeof a);
//변수에 function 정의가 들어갈 수 있다.
let b = (f) => {
    console.log("테스트가 프린트 되기 전에 무조건 실행");
    f();
}

b(a);
b(function(){console.log("test")});

(function(){console.log("test2")}); //즉시 실행하고 싶을경우 괄호로 묶어야함