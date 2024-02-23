import { Component } from '@angular/core';
import { Product } from '../model/product';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'productlist',
  standalone: true,
  imports: [CommonModule],
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
