import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormBuilder, FormGroup, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';
import { ProductV1Service } from '../service/product-v1.service';
import { Router } from '@angular/router';

@Component({
  selector: 'addproduct-v1',
  standalone: true,
  imports: [CommonModule, FormsModule,ReactiveFormsModule],
  templateUrl: './addproduct-v1.component.html',
  styleUrl: './addproduct-v1.component.css'
})
export class AddproductV1Component {

  productForm!: FormGroup;
  productV1Service!: ProductV1Service;
  fb!: FormBuilder;

  router: Router;

  constructor(router: Router, productService: ProductV1Service, fb: FormBuilder, ) {
    this.productV1Service = productService;
    this.fb =fb;
    this.router=router;
    
    this.productForm = this.fb.group(
      {
        productName: ['', [Validators.required, Validators.minLength(3)]],
        productPrice: ['', [Validators.required, Validators.pattern(/^\d+(\.\d{1,2})?$/), Validators.max(100000)]],
        productImage: ['']
      }
    );
  }

  addProduct= ():void =>  {
    let name=this.productForm.value.productName;
    let price = this.productForm.value.productPrice;
    let image = this.productForm.value.productImage ;
    this.productV1Service.addProduct(name,price,image).subscribe(
      result => this.router.navigate(['/list-products']),
      error => console.error('Error adding product:', error)
    );

  }

}

/*
ng g c addproductV1
html file same as in addproduct
ts File, use ProductV1Service
*/
