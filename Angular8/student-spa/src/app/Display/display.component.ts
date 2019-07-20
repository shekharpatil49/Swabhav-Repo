import {Component} from '@angular/core';
import { StudentService } from '../Service/StudentService';
import { Router } from '@angular/router';

@Component({

   selector:'display-student',
   templateUrl:'/display.component.html'

})
export class DisplayComponent{
   result: Object;
   
   constructor(private studnetService:StudentService,private router:Router){
      this.getStudentData();
   }

   getStudentData(){
      this.studnetService.getFacts()
      .then((r)=>{
          this.result=r;
          console.log(this.result);
      })
      .catch((e)=>{
          this.result=e;
      })
  }
  deleteData(n){
   this.studnetService.deleteDataFromStudentArray(n)
   .then((r)=>{
     this.getStudentData();
   })
   .catch((e)=>{
      console.log(e);
   })
   
  }

  

}