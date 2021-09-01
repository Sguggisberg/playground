import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template: `
  <h1>Inline Template</h1>
  <app-other></app-other>
  <app-another>Content von App Another</app-another>
  <app-binding></app-binding>
  `,
  styles: [`
  h1 {
    color: red;
  }
  `]
})
export class AppComponent {
  title = 'databinding';
}
