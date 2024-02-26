import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

// Required for form(reactive) processing 
import { FormBuilder, FormGroup, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'addproduct',
  standalone: true,
  imports: [CommonModule, FormsModule, ReactiveFormsModule],
  templateUrl: './addproduct.component.html',
  styleUrl: './addproduct.component.css'
})
export class AddproductComponent {

  productForm!: FormGroup;

  constructor(private fb: FormBuilder){

    this.productForm = this.fb.group(
      {
        productName: ['', [Validators.required, Validators.minLength(3)]],       
      }
    ); 

  }



}
