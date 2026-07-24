import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { NgClass } from "@angular/common";
import { Attributes } from "./components/attributes/attributes";
import { Structural } from "./components/structural/structural";
import { Parent } from "./parent/parent";

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, NgClass, Attributes, Structural, Parent],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('my-directives');
}
