import { Component } from '@angular/core';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
})
export class LoginComponent {
  constructor(public auth: AuthService, public router: Router) {}
  log!: boolean;
  name2 = '';
  click = 0;
  List = ['jack', 'Mat', 'Simon'];
  name = this.auth.name;
  navigate() {
    this.router.navigateByUrl('/second');
  }
  onreceive() {
    this.auth.oncreate().subscribe({
      next: (data) => {
        console.log(data);
      },
    });
  }
  onsubmit(f: NgForm) {
    console.log(f.value.email);
  }
}
