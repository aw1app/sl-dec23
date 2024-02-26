import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ProductComponent } from './product/product.component';
import { ProductlistComponent } from './productlist/productlist.component';
import { ProductV1Component } from './product-v1/product-v1.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, ProductComponent, ProductlistComponent, ProductV1Component],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title :string = 'my_first_great angular_project';

  isFestiveSeasonOnFromParent:boolean=false;


  // class binding demo
  badCurly:string="bad";

  changeClass = ():void => {
    this.badCurly="bad curly special";
  }

  f1=(evt:any):void => alert (`You clicked a div!. This div has id=${evt.target.id}`);

  counter:number=1;
  processInput = (evt:any)  => console.log(`Hi ${this.counter++}. Value in text feild is ${evt.target.value}`);

  //Demo two way binding
  processInput2 = ()  => this.counter++;

  //Demo two way binding
  t3Text:string="Hello"
  processInput3 = ()  => this.t3Text = this.t3Text+this.counter++;

}
