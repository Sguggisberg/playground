import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-property-binding2',
  template: `
    <p>
      property-binding2 works!
      {{name}}
    </p>
  `,
  styles: [
  ]
})
export class PropertyBinding2Component  {
  @Input() name: string="bla bla";


}
