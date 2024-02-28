import { Injectable } from '@angular/core';
import { Product } from '../model/product';
import { HttpClient } from '@angular/common/http';

import { Observable, throwError } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductV1Service {

  products: Product[] = [];
  httpClient!: HttpClient;

  restAPIServerBaseUrl: string = "http://localhost:3000";

  constructor(httpClient: HttpClient) {
    this.httpClient = httpClient;
  }

  //List API
  getAllProducts(): Observable<Product[]> {
    return this.httpClient.get<Product[]>(`${this.restAPIServerBaseUrl}/products`);
  }

  //Details API
  getProduct = (id: number): Observable<Product> => {
    return this.httpClient.get<Product>(`${this.restAPIServerBaseUrl}/products/${id}`);
  }

  //Delete API
  deleteProduct = (id: number): Observable<string> => {
    return this.httpClient.delete<string>(`${this.restAPIServerBaseUrl}/products/${id}`);
  };

 

  
  // Create API
  newIdsStart:number=10002;

  addProduct(name: string, price: number, image:string): Observable<any>  {

    this.newIdsStart=this.newIdsStart+1;

    let id: number = this.newIdsStart;   

    //let prod: Product = new Product(id, name,image, price, true);
    //const prodJSON = JSON.stringify(prod);

    let prodJSON={
      "id":""+id,
      "name":name,
      "price":price,
      "productImage":image,
    };

    const headers = { 'content-type': 'application/json' };
    

    return this.httpClient.post(`${this.restAPIServerBaseUrl}/products`, prodJSON, { 'headers': headers });
  }

}
