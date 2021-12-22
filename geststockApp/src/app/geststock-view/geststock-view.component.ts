import { Component, OnInit } from '@angular/core';
import { Personne } from '../personne';
import { PersonneService } from '../personne.service';
import { HttpErrorResponse } from '@angular/common/http';
import { BuiltinTypeName } from '@angular/compiler';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-geststock-view',
  templateUrl: './geststock-view.component.html',
  styleUrls: ['./geststock-view.component.css']
})
export class GeststockViewComponent implements OnInit {

  public personnes: Personne[] = [];
  public editPersonne: Personne | undefined;
  public deletePersonne: Personne | undefined;
  title = 'geststockApp';


  constructor(private personneService: PersonneService, private router: Router) {}

  ngOnInit(){
    this.getPersonnes();
  }

  public getPersonnes(): void {
    this.personneService.getPersonnes().subscribe(
      (response: Personne[]) => {
        this.personnes = response;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }

  public onButtonClick(option: string, p?: Personne): void {
    const container = document.getElementById("main-container");
    const btn = document.createElement('button');
    btn.type = 'button';
    btn.style.display = 'none';
    btn.setAttribute('data-toggle', 'modal');
    if(option === 'ajouter'){
      btn.setAttribute('data-target', '#ajouterPersonne');
    }
    if(option === 'modifier'){
      this.editPersonne = p;
      btn.setAttribute('data-target', '#modifierPersonne');
    }
    if(option === 'supprimer'){
      this.deletePersonne = p;
      btn.setAttribute('data-target', '#supprimerPersonne');
    }
    container?.appendChild(btn);
    btn.click(); 
  }

  public onAddPersonne(addForm: NgForm): void{
    alert("we are inside");
    document.getElementById('addPersonneClose')?.click();
    this.personneService.addPersonne(addForm.value).subscribe(
      (response: Personne) => {
        console.log(response);
        this.getPersonnes();
        addForm.reset();
      },
      (error: HttpErrorResponse) =>{
        alert(error.message);
        addForm.reset();
      }
    );
  }

  public onUpdatePersonne(personne: Personne): void{
    document.getElementById('updatePersonneClose')?.click();
    this.personneService.updatePersonne(personne).subscribe(
      (response: Personne) => {
        console.log(response);
        this.getPersonnes();
      },
      (error: HttpErrorResponse) =>{
        alert(error.message);
      }
    );
  }

  public onDeletePersonne(idPersonne: number): void{
    document.getElementById('deletePersonneClose')?.click();
    this.personneService.deletePersonne(idPersonne).subscribe(
      (response: void) => {
        console.log(response);
        this.getPersonnes();
      },
      (error: HttpErrorResponse) =>{
        alert(error.message);
      }
    );
  }

  public loginPage(){
    alert("Hello !!!");
    this.router.navigateByUrl("/login");
  } 

}
