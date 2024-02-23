import { Component } from '@angular/core';
import { Product } from '../model/product';

@Component({
  selector: 'product',
  standalone: true,
  imports: [],
  templateUrl: './product.component.html',
  styleUrl: './product.component.css'
})
export class ProductComponent {

  // name:string ="HP Laptop";
  // price:number =50000.0;

  product!: Product;

  constructor() {
    this.product = new Product("HP Laptop", 50000.0);
  }

}
