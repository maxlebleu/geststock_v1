import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { GeststockViewComponent } from './geststock-view/geststock-view.component';
import { Personne } from './personne';
import { PersonneService } from './personne.service';
import { AuthService } from './services/auth.service';

@Component({
  selector: 'app-root',
  templateUrl: 'app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
 
  public personnes: Personne[] = [];
  
  title = 'geststockApp';


  constructor(private personneService: PersonneService, private router: Router, private authService:AuthService) {}

  ngOnInit(){
    this.getPersonnes();
    this.isAuth();
  }

  public isAuth(): Boolean {
    return this.authService.isLoggedIn;
  }

  public getPersonnes(): void {
    this.personneService.getPersonnes().subscribe(
      (response: Personne[]) => {
        this.personnes = response;
        //this.viewComp.personnes = response;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }

  public searchPersonne(key: string): void {
    const results: Personne[] = [];
    for (const personne of this.personnes){
      if(personne.nom.toLowerCase().indexOf(key.toLowerCase()) !== -1) {
        alert("hello");
        results.push(personne);
      }
    }
    this.personnes = results;
    if(results.length === 0 || !key){
      this.getPersonnes();
    }
  }

  public onAddClick(option: string): void {
    const container = document.getElementById("main-container");
    const btn = document.createElement('button');
    btn.type = 'button';
    btn.style.display = 'none';
    btn.setAttribute('data-toggle', 'modal');
    if(option === 'ajouter'){
      btn.setAttribute('data-target', '#ajouterPersonne');
    }
    container?.appendChild(btn);
    btn.click(); 
  }

}
