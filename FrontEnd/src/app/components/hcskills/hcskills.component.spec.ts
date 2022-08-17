import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HcskillsComponent } from './hcskills.component';

describe('HcskillsComponent', () => {
  let component: HcskillsComponent;
  let fixture: ComponentFixture<HcskillsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HcskillsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(HcskillsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
