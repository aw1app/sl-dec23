console.log(`\n Primitives Demo \n`);

// Decl an number (integer, decimal)
let x2:number =10;

// Decl a boolean
let knowsTypeScript:boolean = false;

// Decl a String
let myname:string = "Tom";

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

 let  car1: Car = new Car("Toyota", 70);
 
 console.log(`Car 1 name is ${car1.name}`);



