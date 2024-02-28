import { Component } from '@angular/core';
import { RouterLink, RouterOutlet } from '@angular/router';
import { ProductlistComponent } from './productlist/productlist.component';
import { AddproductComponent } from './addproduct/addproduct.component';
import { ProductlistV1Component } from './productlist-v1/productlist-v1.component';
import { AddproductV1Component } from './addproduct-v1/addproduct-v1.component';
import { NosuchpathComponent } from './nosuchpath/nosuchpath.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, RouterLink, ProductlistComponent, AddproductComponent,
     ProductlistV1Component,
    AddproductV1Component, NosuchpathComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'angular_project_with_service_routing';
}
