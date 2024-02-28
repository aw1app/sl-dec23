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

  productServiceV1!: ProductV1Service;

  constructor(productService: ProductV1Service) {
    this.productServiceV1 = productService;
  }


  ngOnInit(): void {

    this.productServiceV1.getAllProducts()
      .subscribe(
        data => this.products = data,
        err => console.error('Error fetching products:', err)
      );

  }

  deleteProduct = (id: number): void => {
    this.productServiceV1.deleteProduct(id)
      .subscribe(
        result => console.log(result),
        error => console.error('Error deleting product:', error)
      );

    //After deletion, Fetch the updated list
    this.productServiceV1.getAllProducts()
      .subscribe(
        data => this.products = data,
        err => console.error('Error fetching products:', err)
      );  
  }

  




}
