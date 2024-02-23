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
// object literal
/* Obj literal in JS
let bus1 = {
    name:"Tata",
    model:2022
};
*/
//in TS
let bus1 = {
    name: "Tata",
    model: 2022
};
//Enum Data type in TS 
var ModelYear;
(function (ModelYear) {
    ModelYear[ModelYear["Year2020"] = 20] = "Year2020";
    ModelYear[ModelYear["Year2021"] = 21] = "Year2021";
    ModelYear[ModelYear["Year2022"] = 22] = "Year2022";
    ModelYear[ModelYear["Year2023"] = 23] = "Year2023";
})(ModelYear || (ModelYear = {}));
class Bike {
    constructor(name, mileage, modelYr) {
        this.name = name;
        this.mileage = mileage;
        this.modelYr = modelYr;
    }
}
let bike1 = new Bike("Bullet", 100, 23);
//let bike2 : Bike =  new Bike("Bullet", 100,73 ); // ERROR 
// Union Type
let myVar;
myVar = 10;
myVar = "Suman";
let myVar1;
myVar1 = true;
myVar = "hello";
let myVar3;
myVar3 = 10;
myVar3 = "hello";
myVar3 = 10;
myVar3 = new interface_demo_1.Person("Sundar");
// Any type
let myVar4;
myVar4 = 10;
myVar4 = "hello";
myVar4 = true;
myVar4 = new interface_demo_1.Person("Sundar");
myVar4 = new Car("Maruti", 60);
