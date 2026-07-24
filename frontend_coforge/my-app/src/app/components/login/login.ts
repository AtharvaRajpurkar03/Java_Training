import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-login',
  imports: [FormsModule],
  templateUrl: './login.html',
  styleUrl: './login.css',
})
export class Login {

  email:string='';    
  pwd:string='';

  doLogin(){
    if(this.email=="atharva"&& this.pwd=="atharva123")
      console.log("login successful")
    else
      console.log("invalid credentials")

  }
}
