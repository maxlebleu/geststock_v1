import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GeststockViewComponent } from './geststock-view.component';

describe('GeststockViewComponent', () => {
  let component: GeststockViewComponent;
  let fixture: ComponentFixture<GeststockViewComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GeststockViewComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(GeststockViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
