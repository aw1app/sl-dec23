class Bus {

    name: string;
    private mileage: number;
    protected age: number;
    readonly engineType: string;

    constructor(name: string, mileage: number, age: number, engineType: string) {
        this.name = name;
        this.mileage = mileage;
        this.age = age;
        this.engineType = engineType;
    }

    showMileage = (): number => this.mileage;
}

let bus1:Bus = new Bus("Volvo", 100, 90, "petrol");

// bus1.name // GOOD
// bus1.mileage // ERROR

// bus1.engineType // GOOD
// bus1.engineType = "Gas" // ERROR

//console.log(`Mileage is ${bus1.mileage}`); // ERROR mileage is private
console.log(`Mileage is ${bus1.showMileage()}`);