import { Component, OnInit } from '@angular/core';
import { Student } from '../student';
import { StudentService } from '../Service/StudentService';
import { Router } from '@angular/router';


@Component({
    selector:'add-student',
    templateUrl:'/add.component.html'
})
export class AddComponent implements OnInit{
    student:any={}
  
    constructor(private studentService : StudentService,private router:Router){
       
    }
    ngOnInit(): void {
       
    }
    submit(){
        this.studentService.postData(this.student)
      .then((r)=>{
          console.log(r);
          this.router.navigate(['/display']);
      })
      .catch((e)=>{
          console.log(e);
      })
        

    }
}