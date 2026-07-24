import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Login } from "./components/login/login";
import { Hello } from "./components/hello/hello";
import { AddEmployee } from './components/add-employee/add-employee';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, Login, Hello,AddEmployee],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  title = 'my-app';

  msg="Hello";
}
