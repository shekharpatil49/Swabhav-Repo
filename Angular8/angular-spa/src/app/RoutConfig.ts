import { Routes } from '@angular/router';
import { HomeComponent } from './Home/Home.Component';
import { AboutComponent } from './About/about.component';
import { CareerComponent } from './Career/career.component';


export const routes: Routes=[{
    
    path:'' , redirectTo:'/home',pathMatch:"full"
},
 {

    path:'home' ,component:HomeComponent
},{
    path:'about',component:AboutComponent

},{
    path:'career',component:CareerComponent

}
,{
    path:'career/:id', component:CareerComponent

}];

