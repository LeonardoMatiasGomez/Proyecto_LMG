import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RSocialComponent } from './rsocial.component';

describe('RSocialComponent', () => {
  let component: RSocialComponent;
  let fixture: ComponentFixture<RSocialComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RSocialComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RSocialComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
