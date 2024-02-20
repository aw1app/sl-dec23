"use strict";
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
console.log(`Car 1 name is ${car1.name}`);
