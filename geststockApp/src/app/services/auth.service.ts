import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Personne } from '../personne';
import { PersonneService } from '../personne.service';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  private apiServerUrl= environment.apiBaseUrl;
  public loggedInPersonne!: Personne;
  public isLoggedIn: boolean = true;

  constructor(private http: HttpClient, private personneService: PersonneService) { 
    
  }

  public SignIn(login: string, password: string): Boolean {
    let isAuth: boolean = false;
    const _this = this;
    this.personneService.getPersonne(login, password).subscribe(
      (response: Personne) => {
        console.log(response);        
        _this.loggedInPersonne = response;        
        localStorage.setItem('loggedUser', ""+this.loggedInPersonne.idPersonne);
        _this.isLoggedIn = true;
      },
      (error: HttpErrorResponse) =>{
        _this.isLoggedIn = false; 
      },      
    );
    return _this.isLoggedIn;
  }

}
