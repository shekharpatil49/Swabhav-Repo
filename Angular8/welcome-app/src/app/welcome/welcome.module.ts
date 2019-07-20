import { NgModule } from "@angular/core";
import {BrowserModule} from '@angular/platform-browser';
import { AppRoutingModule } from '../app-routing.module';
import { WelcomeComponent } from './welcome.component';
import { FormsModule }   from '@angular/forms';
import { MultiBindingComponent } from './multibinding.component'
import { NumberAPIService } from '../service/NumberAPIService';
import { HttpClientModule } from '@angular/common/http';
import { BtnToggleComponent } from './btntoggle.component';
import { BtnRatingComponent } from './btnrating.component';

@NgModule({
    declarations: [
        WelcomeComponent,
        MultiBindingComponent,
        BtnToggleComponent,
        BtnRatingComponent
      ],
      imports: [
        HttpClientModule,
        BrowserModule,
        AppRoutingModule,
        FormsModule
      ],
      providers: [NumberAPIService],
      bootstrap: [WelcomeComponent]

})
export class WelcomeModule{


}