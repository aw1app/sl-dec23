import { Routes } from '@angular/router';
import { ProductlistV1Component } from './productlist-v1/productlist-v1.component';
import { AddproductV1Component } from './addproduct-v1/addproduct-v1.component';
import { ProductV1Component } from './product-v1/product-v1.component';
import { NosuchpathComponent } from './nosuchpath/nosuchpath.component';
import { UpdateproductComponent } from './updateproduct/updateproduct.component';

export const routes: Routes = [

    { path: 'add-product', component: AddproductV1Component },
    { path: 'list-products', component: ProductlistV1Component },
    { path: 'product/:productId', component: ProductV1Component },
    { path: 'update-product/:productId', component: UpdateproductComponent },
    { path: '**', component: NosuchpathComponent },
];
