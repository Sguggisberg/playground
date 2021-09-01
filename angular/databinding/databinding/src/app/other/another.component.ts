import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-another',
  template: `
   <hr>
  <h1>Another Component</h1>

  <h2>NG Content</h2>
  <ng-content></ng-content>

  <hr>





  `,
  styles: [
  ]
})
export class AnotherComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}
