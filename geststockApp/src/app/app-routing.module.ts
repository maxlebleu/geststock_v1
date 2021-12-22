import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { AuthentificationComponent } from './authentification/authentification.component';
import { GeststockViewComponent } from './geststock-view/geststock-view.component';

const routes: Routes = [
  {path: "authentification", component: AuthentificationComponent},
  {path: 'home', component: GeststockViewComponent},
  {path: '', component: AuthentificationComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
