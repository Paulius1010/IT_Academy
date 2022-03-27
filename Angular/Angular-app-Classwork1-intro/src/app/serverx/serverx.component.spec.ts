import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ServerxComponent } from './serverx.component';

describe('ServerxComponent', () => {
  let component: ServerxComponent;
  let fixture: ComponentFixture<ServerxComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ServerxComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ServerxComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
