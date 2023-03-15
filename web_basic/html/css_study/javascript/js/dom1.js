const divs = document.getElementsByTagName("div");

console.log(divs);

divs[0].innerHTML += `<button>버튼<button>`;

console.log(divs[0].innerHTML);

const newButton = document.createElement("button");
const newButtonText = document.createTextNode("버튼2");
const buttonTypeAtrribute = document.createAttribute("type");
newButton.setAttributeNode(buttonTypeAtrribute);
newButton.setAttribute("type","button");
newButton.appendChild(newButtonText);
divs[0].appendChild(newButton)