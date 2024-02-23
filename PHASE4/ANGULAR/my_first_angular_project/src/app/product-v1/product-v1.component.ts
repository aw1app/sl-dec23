import { Component, Input, OnInit } from '@angular/core';
import { Product } from '../model/product';

@Component({
  selector: 'product-v1',
  standalone: true,
  imports: [],
  templateUrl: './product-v1.component.html',
  styleUrl: './product-v1.component.css'
})
export class ProductV1Component implements OnInit {

  product!: Product;

  @Input("name") name!: string;
  @Input("price") price!: string;

  constructor() {
  }

  ngOnInit(): void {
    this.product = new Product(this.name, Number(this.price));
  }

}
