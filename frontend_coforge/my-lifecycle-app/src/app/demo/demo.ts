import { AfterContentChecked, AfterContentInit, AfterViewChecked, AfterViewInit, Component, DoCheck, Input, OnChanges, OnDestroy, OnInit, SimpleChanges } from '@angular/core';

@Component({
  selector: 'app-demo',
  imports: [],
  templateUrl: './demo.html',
  styleUrl: './demo.css',
})
export class Demo implements OnChanges,OnInit,DoCheck,AfterContentInit,AfterContentChecked,AfterViewInit,AfterViewChecked,OnDestroy{

  @Input() myname=''
  constructor(){
    console.log("1. Constructor")
  }
  ngAfterContentInit(): void {
    console.log("2. ngAfterContentInit")
  }

  ngOnChanges(changes: SimpleChanges): void {
    console.log("3. ngOnChanges", changes)
  }

  ngOnInit(): void {
    console.log("4. ngOnInit")
  }

  ngDoCheck(): void {
    console.log("5. ngDoCheck")
  }

  ngAfterContentChecked(): void {
    console.log("6. ngAfterContentChecked")
  }

  ngAfterViewInit(): void {
    console.log("7. ngAfterViewInit")
  }

  ngAfterViewChecked(): void {
    console.log("8. ngAfteriewChecked")
  }

  ngOnDestroy(): void {
    console.log("9. ngOnDestroy")
  }

  callName(){
    this.myname="Atharva Rajpurkar"
  }
}
