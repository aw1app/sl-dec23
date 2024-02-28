import { Routes } from '@angular/router';
import { AddproductComponent } from './addproduct/addproduct.component';
import { ProductlistV1Component } from './productlist-v1/productlist-v1.component';

export const routes: Routes = [

    { path: 'add-product', component: AddproductComponent },
    { path: 'list-products', component: ProductlistV1Component },


];
