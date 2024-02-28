import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddproductV1Component } from './addproduct-v1.component';

describe('AddproductV1Component', () => {
  let component: AddproductV1Component;
  let fixture: ComponentFixture<AddproductV1Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AddproductV1Component]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(AddproductV1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
