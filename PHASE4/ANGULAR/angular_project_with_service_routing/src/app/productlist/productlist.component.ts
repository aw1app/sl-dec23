import { Component, OnInit } from '@angular/core';
import { Product } from '../model/product';
import { ProductService } from '../service/product.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'productlist',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './productlist.component.html',
  styleUrl: './productlist.component.css'
})
export class ProductlistComponent implements OnInit {

  products!: Product[];

  productService!: ProductService;

  constructor(productService: ProductService) {
    this.productService = productService;
  }


  ngOnInit(): void {
    this.products = this.productService.getAllProducts();
  }

}
