import { Component } from '@angular/core';
import { FormBuilder, FormGroup, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';
import { ProductService } from '../service/product.service';

@Component({
  selector: 'addproduct',
  standalone: true,
  imports: [FormsModule,ReactiveFormsModule],
  templateUrl: './addproduct.component.html',
  styleUrl: './addproduct.component.css'
})
export class AddproductComponent {

  productForm!: FormGroup;
  productService!: ProductService;
  fb!: FormBuilder;

  constructor(productService: ProductService, fb: FormBuilder) {
    this.productService = productService;

    this.productForm = this.fb.group(
      {
        productName: ['', [Validators.required, Validators.minLength(3)]],
        productPrice: ['', [Validators.required, Validators.pattern(/^\d+(\.\d{1,2})?$/), Validators.max(100000)]]
      }
    );
  }

  addProduct= ():number =>  this.productService.addProduct(this.productForm.value.productName,this.productForm.value.productPrice);

}
