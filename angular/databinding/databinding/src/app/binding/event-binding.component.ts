import { Component, OnInit, EventEmitter, Output } from '@angular/core';


@Component({
  selector: 'app-event-binding',
  template: `
<div (click)="myClick()"></div>
  `,
  styles: [`
    div {
      width: 100px;
      height: 100px;
      background-color: green;
    }
  `]
})
export class EventBindingComponent implements OnInit {

  constructor() { }

 @Output() clicked = new EventEmitter<string>();


  ngOnInit(): void {
  }


  myClick(){
    console.log('My Klick');
    this.clicked.emit('Neuer Text');
  }
}
