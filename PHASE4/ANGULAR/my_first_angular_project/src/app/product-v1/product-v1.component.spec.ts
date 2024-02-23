import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductV1Component } from './product-v1.component';

describe('ProductV1Component', () => {
  let component: ProductV1Component;
  let fixture: ComponentFixture<ProductV1Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ProductV1Component]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(ProductV1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
