let numbers1 = [1,2,3,4,5];
let numbers2 = [6,7,8,9,10];
let numbers3 = new Array();
let numbers4 = numbers1.concat(numbers2);
console.log(numbers4);

console.log(numbers1);
console.log(typeof numbers2);
console.log(typeof numbers3);

function odd(num) {
    return num %2 != 0;
}

let numbers5 = numbers4.filter(odd);
console.log(numbers5);

let numbers6 = numbers4.filter(n => n%2 !=0);
console.log(numbers6);

for(let i = 0; i < numbers5.length;i++) {
    console.log("i: " + numbers5[i]);
}

for(let num of numbers5) {
    console.log(`forEach : ${num}`);
}

numbers5.forEach(n => console.log(`ArrayForEach: ${n}`));

console.log(numbers5.indexOf(5)); // 5의 인덱스 찾기
console.log(numbers5.lastIndexOf(2));
console.log(numbers5.join(",")); //배열안에 모든것을 합쳐줌 
console.log(numbers5.push(11)); //add 같은 역할 
console.log(numbers5);
console.log(numbers5.unshift(13)); //첫번째 인덱스에 11값을 추가 시켜주는거
console.log(numbers5);
console.log(numbers5.pop()); // 마지막값을 무조건 지우기(스택구조임);
console.log(numbers5);
numbers5.splice(2,2,[15,16],17); //2번 인덱스부터 2개 지우고 2개를 넣어라
console.log(numbers5);
console.log(numbers5.slice(3,6)); //3~6인덱스 뽑기

function compare(n1,n2) {
    if(n1 > n2) return 1;
    if(n1 === n2) return 0;
    if(n1 < n2) return  -1;
}

console.log(numbers5.sort(compare));

const backButton = document.getElementsByTagName("button");
backButton[0].onclick = () => {
    history.back();
}