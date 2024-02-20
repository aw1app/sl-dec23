"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
console.log(`\n Primitives Demo \n`);
// Decl an number (integer, decimal)
let x2 = 10;
// Decl a boolean
let knowsTypeScript = false;
// Decl a String
let myname = "Tom";
console.log(`Name is ${myname}`);
console.log(`\n Non Primitives Demo \n`);
class Car {
    constructor(name, mileage) {
        this.name = name;
        this.mileage = mileage;
    }
}
let car1 = new Car("Toyota", 70);
console.log(`Car 1 name is ${car1.name} and mileage is ${car1.mileage}`);
// Demo Using classes that were defined in some other file
const interface_demo_1 = require("./interface-demo");
let per10 = new interface_demo_1.Person("Mr President");
per10.walkFast();
// Array
let myArr1 = []; // in Plain JS
let myArr2 = []; // in TS
let carsArr = [];
carsArr[0] = new Car("Ford", 100);
carsArr[1] = new Car("Maruti", 150);
carsArr.push(new Car("Fiat", 250));
console.log(`\n Array type Demo \n ${carsArr}`);
console.log(`\n First car name is \n ${carsArr[0].name}`);
