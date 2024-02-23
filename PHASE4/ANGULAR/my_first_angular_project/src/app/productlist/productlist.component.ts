import { Component } from '@angular/core';
import { Product } from '../model/product';

@Component({
  selector: 'productlist',
  standalone: true,
  imports: [],
  templateUrl: './productlist.component.html',
  styleUrl: './productlist.component.css'
})
export class ProductlistComponent {

  products!:Product[];

  constructor() {
    this.products = [
      new Product("HP Laptop", 50000.0),
      new Product("Dell Laptop", 57000.0),
      new Product("Sony Monitor", 20075.0),
      new Product("TCL TV", 50400.50),
    ];
  }

}
