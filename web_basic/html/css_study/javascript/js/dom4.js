/**
 * 1. 추가버튼 클릭시 input에 들어있는 value의 값을 list에 추가
 * 2. 확인버튼 클릭시 todo-content의 생상을 rd로 변경, 취소선 적용
 * 3. 확인버튼 다시 클릭시 todo-content의 생상ㅇ르 black으로 변경, 취소선 미적용
 * 
 * 
 * 
 * 
 */

const addbutton = document.getElementsByClassName("add-button");
const okbutton = document.getElementsByClassName("ok-button");

addbutton[0].onclick = () => {
    const todotext = document.getElementsByClassName("todo-text");
    const todolist = document.getElementsByClassName("todo-list");
    todolist[0].innerHTML += `
    <li><input type="checkbox" class="ok-check"><span class="todo-content">${todotext[0].value}</span></li>
    `
    todotext[0].value = "";

    addEvent();
}
function addEvent() {
    const okCheck = document.getElementsByClassName("ok-check");
    const todocontent = document.getElementsByClassName("todo-content");
    for(let i = 0 ; i< okCheck.length;i++){
    okCheck[i].onclick = () => {
        if(okCheck[i].checked){
            todocontent[i].style.color = "red";
            todocontent[i].style.textDecoration = "line-through";
        } else {
            todocontent[i].style.color = "black";
            todocontent[i].style.textDecoration = "none";
        }

    }   
}
}