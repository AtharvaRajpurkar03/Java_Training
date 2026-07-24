import { Component } from '@angular/core';

@Component({
  selector: 'app-structural',
  imports: [],
  templateUrl: './structural.html',
  styleUrl: './structural.css',
})
export class Structural {


  // isLoggedIn=false;

  // checkLogin(){
  //   this.isLoggedIn=!this.isLoggedIn
  // }

  // role = 'student'
  students = [
    { id: 1, name: 'Atharva', course: 'Python' },
    { id: 2, name: 'Sahil', course: 'Java' },
    { id: 3, name: 'Shiva', course: 'Angular' },
  ]

  // changeRole(role:string){
  //   this.role=role
  // }
}

