import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductlistV1Component } from './productlist-v1.component';

describe('ProductlistV1Component', () => {
  let component: ProductlistV1Component;
  let fixture: ComponentFixture<ProductlistV1Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ProductlistV1Component]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(ProductlistV1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
