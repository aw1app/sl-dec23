"use strict";
class Bus {
    constructor(name, mileage, age, engineType) {
        this.showMileage = () => this.mileage;
        this.name = name;
        this.mileage = mileage;
        this.age = age;
        this.engineType = engineType;
    }
}
let bus1 = new Bus("Volvo", 100, 90, "petrol");
// bus1.name // GOOD
// bus1.mileage // ERROR
// bus1.engineType // GOOD
// bus1.engineType = "Gas" // ERROR
//console.log(`Mileage is ${bus1.mileage}`); // ERROR mileage is private
console.log(`Mileage is ${bus1.showMileage()}`);
