import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProyectosparticComponent } from './proyectospartic.component';

describe('ProyectosparticComponent', () => {
  let component: ProyectosparticComponent;
  let fixture: ComponentFixture<ProyectosparticComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ProyectosparticComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ProyectosparticComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
