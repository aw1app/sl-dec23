"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Person = void 0;
class Person {
    constructor(name) {
        this.name = name;
    }
    walkFast() {
        console.log(`${this.name} : Walking fast..`);
    }
}
exports.Person = Person;
;
let per1 = new Person("Sujata");
per1.walkFast();
// Abstract class
class ABC {
    constructor() {
        this.walkNormal = () => console.log("Walking ...., normal walking");
    }
}
// let abc1:ABC = new ABC();  // ERROR
class GreatABC extends ABC {
    walkSlow() {
        console.log("Walking ...., slowly walking");
    }
}
let abc1 = new GreatABC();
abc1.walkSlow();
abc1.walkNormal();
