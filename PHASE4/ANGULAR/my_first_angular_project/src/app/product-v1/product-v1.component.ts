import { Component, EventEmitter, Input, OnChanges, OnDestroy, OnInit, Output } from '@angular/core';
import { Product } from '../model/product';

@Component({
  selector: 'product-v1',
  standalone: true,
  imports: [],
  templateUrl: './product-v1.component.html',
  styleUrl: './product-v1.component.css'
})
export class ProductV1Component implements OnInit,OnChanges,OnDestroy {

  product!: Product;

  @Input("name") name!: string;
  @Input("price") price!: string;
  @Input("isFestiveSeasonOn") isFestiveSeasonOn!:boolean;

  @Output() increasePriceEvent = new EventEmitter<number>();

  callParentForIncreasingPrice = (): void => {
    this.increasePriceEvent.emit(5000);
  }

  constructor() {
    console.log("Inside constructor")
    //this.product = new Product(this.name, Number(this.price),this.isFestiveSeasonOn );
  }

  ngOnChanges(): void { console.log("Inside ngOnChanges " + this.name); }

  ngOnInit(): void {
    console.log("Inside ngOnInit")
    this.product = new Product(this.name, Number(this.price),this.isFestiveSeasonOn );
  }

  ngOnDestroy(): void { console.log("Inside ngOnDestroy")}

}
