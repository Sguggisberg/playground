import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { OtherComponent } from './other/other.component';
import { AnotherComponent } from './other/another.component';
import { BindingComponent } from './binding/binding.component';
import { PropertyBinding2Component } from './binding/property-binding2.component';
import { EventBindingComponent } from './binding/event-binding.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    OtherComponent,
    AnotherComponent,
    BindingComponent,
    PropertyBinding2Component,
    EventBindingComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
