import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PageNotFounComponent } from './page-not-foun.component';

describe('PageNotFounComponent', () => {
  let component: PageNotFounComponent;
  let fixture: ComponentFixture<PageNotFounComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PageNotFounComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PageNotFounComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
