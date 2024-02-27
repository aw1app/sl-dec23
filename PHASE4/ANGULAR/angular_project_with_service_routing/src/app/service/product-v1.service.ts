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

  //Delete API
  deleteProduct = (id: number): Observable<string> => {
    return this.httpClient.delete<string>(`${this.restAPIServerBaseUrl}/products/${id}`);
  };

}
