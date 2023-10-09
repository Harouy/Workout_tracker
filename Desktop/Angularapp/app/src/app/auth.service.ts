import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class AuthService {
  url = 'jjueuie';
  constructor(private HTTP: HttpClient) {}
  name = 'Simon';
  oncreate() {
   return  this.HTTP.get(this.url);
  }
}
