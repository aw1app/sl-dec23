interface Human {
    name: string;

    walkFast(): void;
}


export class Person implements Human {
    name: string;

    constructor(name: string) {
        this.name = name;
    }

    walkFast(): void {
        console.log(`${this.name} : Walking fast..`);
    }
};

let  per1: Person = new Person("Sujata");
per1.walkFast();


// Abstract class

abstract class ABC{

   abstract walkSlow():void ;

   walkNormal = () =>  console.log("Walking ...., normal walking");

}

// let abc1:ABC = new ABC();  // ERROR
class GreatABC extends ABC{

    walkSlow():void {
        console.log("Walking ...., slowly walking");
    }
 }

 let abc1:GreatABC = new GreatABC();

 abc1.walkSlow();
 abc1.walkNormal();
