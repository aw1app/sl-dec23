"use strict";
// function f1(x,y){
Object.defineProperty(exports, "__esModule", { value: true });
//     return x+y
//  }
function f1(x, y) {
    return x + y;
}
const arrowf1 = (x, y) => x + y;
function f2(x, y) {
    console.log(x + y);
}
;
let result = f1(4, 5);
console.log(result);
let arrow_result = arrowf1(4, 5);
console.log(arrow_result);
f2(40, 5);
function f3(x, y) {
    return function () { console.log("Hi"); };
}
;
let g = f3(4, 5);
g();
// can we set return type  like class name - YES
const interface_demo_1 = require("./interface-demo");
let f4 = (name) => new interface_demo_1.Person(name);
let person1 = f4("Joginder");
