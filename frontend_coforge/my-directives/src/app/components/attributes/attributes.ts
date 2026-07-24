import { NgClass } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-attributes',
  imports: [NgClass],
  templateUrl: './attributes.html',
  styleUrl: './attributes.css',
})
export class Attributes {
  isRed=true
}
