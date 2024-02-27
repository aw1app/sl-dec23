import { Injectable } from '@angular/core';
import { Product } from '../model/product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  products: Product[] = [];

  constructor() { 
    this.products[0] = new Product(1, "HP Mouse", "../../assets/images/HPMouse.JPG", 250, true);
    this.products[1] = new Product(2, "iPhone", "../../assets/images/Apple-Phone.JPG", 50250, true);
    this.products[2] = new Product(3, "Dell Monitor", "../../assets/images/dell.JPG", 15250, true);
    this.products[3] = new Product(4, "Lenova Keyboard", "https://5.imimg.com/data5/IA/UN/MY-3208689/lenovo-laptops-.png", 2500, true);
  }


  // API
  getAllProducts(): Product[] {
    return this.products;
  }

  getProductById = (id: number): Product => this.products.filter(product => product.id === id)[0];

  productIndex: number = 0;
  addProduct = (name: string, price: number): number =>
    this.products.push(new Product(this.productIndex++, name, "../../assets/images/Apple-Phone.JPG", price, true));

  deleteProduct = (id: number): void => {
      this.products = this.products.filter(product => product.id !== id);
    };  

}
