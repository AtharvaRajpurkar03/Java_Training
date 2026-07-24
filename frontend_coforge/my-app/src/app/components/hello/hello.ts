import { Component } from '@angular/core';

@Component({
  selector: 'app-hello',
  imports: [],
  templateUrl: './hello.html',
  styleUrl: './hello.css',
})
export class Hello {
  msg = 'Hello';
  color = 'blue';
  fontSize = 40;
  borderStyle = '3px solid black';
  textColor = 'red';
  isDisabled = true;

  source =
    'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRUVimHj00HsYA7jREN7Rj-OXmpo3gUBiLVg81utVyRDA&s=10';

  changeColor() {
    this.color = this.color === 'blue' ? 'green' : 'blue';
  }

  changeBorder() {
    this.borderStyle =
      this.borderStyle === '3px solid black' ? '5px dotted yellow' : '3px solid black';
  }

  toggleButton() {
    this.isDisabled = !this.isDisabled;
  }
}
