import { Routes } from '@angular/router';
import { ProductlistV1Component } from './productlist-v1/productlist-v1.component';
import { AddproductV1Component } from './addproduct-v1/addproduct-v1.component';

export const routes: Routes = [

    { path: 'add-product', component: AddproductV1Component },
    { path: 'list-products', component: ProductlistV1Component },


];
