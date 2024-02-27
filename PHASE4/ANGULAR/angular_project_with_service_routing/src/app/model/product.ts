export class Product {

    id: number = -1;

    name: string = "HP Mouse";
    price: number = 250;

    productImage: string = "";
    productInStock:boolean=true;

    constructor(id: number =-1, productName: string, productImage: string, price: number, productInStock:boolean) {
        this.id = id;
        this.name = productName;
        this.productImage = productImage;
        this.price = price;
        this.productInStock= productInStock;
    }

}
