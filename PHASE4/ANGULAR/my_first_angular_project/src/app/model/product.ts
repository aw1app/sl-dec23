export class Product {

    name!: string;
    price!: number;
    isFestiveSeasonOn!:boolean;

    constructor(name: string,price: number,isFestiveSeasonOn:boolean=true ){
        this.name=name;
        this.price=price;
        this.isFestiveSeasonOn=isFestiveSeasonOn;
    }

}
