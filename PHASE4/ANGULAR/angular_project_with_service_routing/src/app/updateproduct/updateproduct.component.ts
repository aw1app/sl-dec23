import { Component } from '@angular/core';
import { FormBuilder, FormGroup, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { ProductV1Service } from '../service/product-v1.service';
import { Product } from '../model/product';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'updateproduct',
  standalone: true,
  imports: [CommonModule, FormsModule,ReactiveFormsModule],
  templateUrl: './updateproduct.component.html',
  styleUrl: './updateproduct.component.css'
})
export class UpdateproductComponent {

  productForm!: FormGroup;
  productV1Service!: ProductV1Service;
  fb!: FormBuilder;

  product!:Product;

  route: ActivatedRoute;

  constructor(route: ActivatedRoute, productService: ProductV1Service, fb: FormBuilder, ) {
    this.productV1Service = productService;
    this.fb =fb;
    this.route=route;    
  }

  ngOnInit(): void {

    this.route.paramMap.subscribe(

      params => {
        const productId = params.get('productId');

        if (productId !== null) {
          this.productV1Service.getProduct(Number(productId)).subscribe(
            prod => {
              this.product = prod;
              this.productForm = this.fb.group(
                {
                  productName: [this.product.name, [Validators.required, Validators.minLength(3)]],
                  productPrice: [this.product.price, [Validators.required, Validators.pattern(/^\d+(\.\d{1,2})?$/), Validators.max(100000)]],
                  productImage: [this.product.productImage]
                }
              );             
            },

            err => console.log(err)
          );
        }

      }
    );
  }

  updateProduct= ():void =>  {
    let name=this.productForm.value.productName;
    let price = this.productForm.value.productPrice;
    let image = "assets/images/"+this.productForm.value.productImage ;
    this.productV1Service.addProduct(name,price,image).subscribe(
      result => console.log(),
      error => console.error('Error adding product:', error)
    );

  }


}
