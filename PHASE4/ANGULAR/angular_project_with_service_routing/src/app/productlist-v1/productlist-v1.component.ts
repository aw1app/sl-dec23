import { Component } from '@angular/core';
import { Product } from '../model/product';
import { ProductV1Service } from '../service/product-v1.service';
import { CommonModule } from '@angular/common';
import { Router } from '@angular/router';

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
  router:Router

  constructor(router:Router, productService: ProductV1Service) {
    this.productServiceV1 = productService;
    this.router=router;
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
        result => this.router.navigate(['/list-products']),
        error => console.error('Error deleting product:', error)
      );

   
  }


}
