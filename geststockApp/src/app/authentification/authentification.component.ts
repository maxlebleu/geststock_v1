import { formatCurrency } from '@angular/common';
import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Personne } from '../personne';
import { PersonneService } from '../personne.service';
import { AuthService } from '../services/auth.service';

@Component({
  selector: 'app-authentification',
  templateUrl: './authentification.component.html',
  styleUrls: ['./authentification.component.css']
})
export class AuthentificationComponent implements OnInit {
  public componentVar: string = "Variable venant du component";  
  errorMsg: string = "";
  public role: string = "";
  
  constructor(private authService: AuthService, private router: Router) { }

  ngOnInit(): void {
  }

  onLoggedIn(form: NgForm) {    
    let login = form.value['login'];
    let password = form.value["password"];
    if(this.authService.SignIn(login, password)){      
      
      this.router.navigate(['home']);     
    }
    else{
      this.errorMsg = "Login ou Mot de passe incorrect";
    }
  }
}
