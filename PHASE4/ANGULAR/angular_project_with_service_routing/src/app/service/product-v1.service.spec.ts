import { TestBed } from '@angular/core/testing';

import { ProductV1Service } from './product-v1.service';

describe('ProductV1Service', () => {
  let service: ProductV1Service;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ProductV1Service);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
