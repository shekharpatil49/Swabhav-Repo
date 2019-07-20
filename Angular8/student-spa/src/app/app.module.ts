import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { StudentService } from './Service/StudentService';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { DisplayComponent } from './Display/display.component';
import { IsMale } from './isMale';
import { AddComponent } from './Add/add.component';
import {FormsModule} from '@angular/forms'
import { EditComponent } from './Edit/edit.component';
import {SearchPipe}  from './Display/search.pipe'

@NgModule({
  declarations: [
    AppComponent,
    DisplayComponent,
    AddComponent,
    IsMale ,
    EditComponent,
    SearchPipe 
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
   
  ],
  providers: [StudentService],
  bootstrap: [AppComponent]
})
export class AppModule { }
