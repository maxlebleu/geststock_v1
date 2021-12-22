import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Personne } from './personne';

@Injectable({
  providedIn: 'root'
})
export class PersonneService {
  private apiServerUrl= environment.apiBaseUrl;

  constructor(private http: HttpClient) { }

  public getPersonnes(): Observable<Personne[]>{
    return this.http.get<Personne[]>(`${this.apiServerUrl}/GestStock/Login`);
  }

  public getPersonne(login: string, password: string): Observable<Personne>{
    return this.http.post<Personne>(`${this.apiServerUrl}/GestStock/Login/auth`, {login, password}, 
    {headers: { 'Content-Type': 'application/json' }});
  }

  public addPersonne(personne: Personne): Observable<Personne>{
    return this.http.post<Personne>(`${this.apiServerUrl}/GestStock/Login/add`, personne);
  }

  public updatePersonne(personne: Personne): Observable<Personne>{
    return this.http.put<Personne>(`${this.apiServerUrl}/GestStock/Login/update`, personne);
  }

  public deletePersonne(idPersonne: number): Observable<void>{
    return this.http.delete<void>(`${this.apiServerUrl}/GestStock/Login/delete/${idPersonne}`);
  }

  public getRole(){
    
  }

}
