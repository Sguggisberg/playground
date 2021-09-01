import { Component } from '@angular/core';
@Component({
  selector: 'app-binding',
  templateUrl: './binding.component.html',
  styles: [`
  .red-border {
    border: 1px solid red;
  }
  `]
})
export class BindingComponent {

  aString = 'String Text';
  attachClass = false;

constructor(){
  setTimeout(() => {
      this.aString = "abc";
      this.attachClass = true;
  }, 3000);
}

myClick(){
  console.log("Hallo");
}

myClick2(event: Event){
  console.log(event);
}

}
