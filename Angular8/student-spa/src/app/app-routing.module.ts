import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DisplayComponent } from './Display/display.component';
import { AddComponent } from './Add/add.component';
import { EditComponent } from './Edit/edit.component';


export const routes: Routes=[{
    
  path:'' , redirectTo:'/display',pathMatch:"full"
},
{
  path:'display' ,component:DisplayComponent
}
,
{
  path:'edit/:id' ,component:EditComponent
},
{
  path:'add', component:AddComponent
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
