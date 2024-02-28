import { Component, OnInit } from '@angular/core';
import { Product } from '../model/product';
import { ProductV1Service } from '../service/product-v1.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-product-v1',
  standalone: true,
  imports: [],
  templateUrl: './product-v1.component.html',
  styleUrl: './product-v1.component.css'
})
export class ProductV1Component implements OnInit{

  product!:Product;
  productService: ProductV1Service;

  route!: ActivatedRoute;

  constructor(productService: ProductV1Service, route: ActivatedRoute) {
    this.productService = productService;
    this.route = route;
  }


  ngOnInit(): void {
    
    this.productService.

  }

  

}
