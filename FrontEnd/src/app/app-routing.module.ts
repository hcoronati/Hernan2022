import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {HomeComponent} from './components/home/home.component' ;
import {InformacionComponent} from './components/informacion/informacion.component' ;

const routes: Routes = [
  {path:'', component: HomeComponent },
  {path:'informacion', component: InformacionComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
