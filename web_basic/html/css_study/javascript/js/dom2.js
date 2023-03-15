const box = document.getElementsByClassName("box");
box[0].style.backgroundColor = "black" ;

addEvent();
function addEvent(){
const redbutton = document.getElementsByClassName("red-button")
const bluebutton = document.getElementsByClassName("blue-button")

for(let i = 0 ; i < box.length; i++) {
    redbutton[i].onclick = () => {
        box[i].style.backgroundColor = "red"
    }
    bluebutton[i].onclick = () => {
        box[i].style.backgroundColor = "blue"
    }
}
}

const addButton = document.getElementsByClassName("add-button")

addButton[0].onclick = () => {
    const container = document.getElementsByClassName("container");
    container[0].innerHTML += `
    <div class="box"></div>
    <button class="red-button">빨간색</button>
    <button class="blue-button">파란색</button>
    `;
    box[box.length-1].style.backgroundColor = "black";

    addEvent();
}

const doubleAddButton = document.getElementsByClassName("double-add-button")
doubleAddButton[0].onclick = () => {
    const container = document.getElementsByClassName("container");
    container[0].innerHTML += `
    <div class="box"></div>
    <button class="red-button">빨간색</button>
    <button class="blue-button">파란색</button>
    <div class="box"></div>
    <button class="red-button">빨간색</button>
    <button class="blue-button">파란색</button>
    `;
    box[box.length-1].style.backgroundColor = "black";
    box[box.length-2].style.backgroundColor = "black";

    addEvent();
}
