console.log(`\n Primitives Demo \n`);

// Decl an number (integer, decimal)
let x2: number = 10;

// Decl a boolean
let knowsTypeScript: boolean = false;

// Decl a String
let myname: string = "Tom";

console.log(`Name is ${myname}`);

console.log(`\n Non Primitives Demo \n`);

class Car {

    name: string;
    mileage: number;

    constructor(name: string, mileage: number) {
        this.name = name;
        this.mileage = mileage;
    }

}

let car1: Car = new Car("Toyota", 70);

console.log(`Car 1 name is ${car1.name} and mileage is ${car1.mileage}`);

// Demo Using classes that were defined in some other file
import { Person } from './interface-demo';

let per10: Person = new Person("Mr President");
per10.walkFast();

// Array
let myArr1 = []; // in Plain JS

let myArr2 : string[] = []; // in TS

let carsArr: Car[] = [];
carsArr[0] = new Car("Ford",100);
carsArr[1] = new Car("Maruti",150);

carsArr.push(new Car("Fiat",250));

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
let bus1: {name:string, model:number } = {
    name:"Tata",
    model:2022
};

//Enum Data type in TS 
enum ModelYear { Year2020=20, Year2021, Year2022, Year2023 }

class Bike{
    name:string;
    mileage:number;
    modelYr:ModelYear;

    constructor(name:string, mileage:number,modelYr:ModelYear  ){
        this.name=name;
        this.mileage=mileage;
        this.modelYr=modelYr;
    }
}

let bike1 : Bike =  new Bike("Bullet", 100,23 );
//let bike2 : Bike =  new Bike("Bullet", 100,73 ); // ERROR 



