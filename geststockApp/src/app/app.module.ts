import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClient } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PersonneService } from './personne.service';
import { FormsModule } from '@angular/forms';
import { AuthentificationComponent } from './authentification/authentification.component';
import { RouterModule } from '@angular/router';
import { APP_BASE_HREF } from '@angular/common';
import { GeststockViewComponent } from './geststock-view/geststock-view.component';
import { AuthService } from './services/auth.service';

@NgModule({
  declarations: [
    AuthentificationComponent,
    AppComponent,
    GeststockViewComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule, 
    FormsModule,
    AppRoutingModule
  ],
  providers: [PersonneService, {provide:APP_BASE_HREF, useValue: '/'}, AuthService ],
  bootstrap: [AppComponent]
})
export class AppModule { }
