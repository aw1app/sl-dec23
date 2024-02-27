import { Component } from '@angular/core';
import { Product } from '../model/product';
import { ProductV1Service } from '../service/product-v1.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'productlist-v1',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './productlist-v1.component.html',
  styleUrl: './productlist-v1.component.css'
})
export class ProductlistV1Component {

  products!: Product[];

  productService!: ProductV1Service;

  constructor(productService: ProductV1Service) {
    this.productService = productService;
  }


  ngOnInit(): void {

    this.productService.getAllProducts()
      .subscribe(
        data => this.products = data,
        err => console.error('Error fetching products:', err)
      );

  }



}
