import { } from '../Display/display.component'
import { StudentService } from '../Service/StudentService';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, ParamMap, Router } from '@angular/router';
import { Student } from '../student';


@Component({

    selector: 'edit-student',
    templateUrl: '/edit.component.html'

})
export class EditComponent implements OnInit{
   
    id: string;
    studentArray: Object;
    student:any={}
    gender:string;
    
    

    constructor(private router : Router,private route: ActivatedRoute, private studnetService: StudentService
    ) {
        this.route.paramMap.subscribe(param => {
            this.id = param.get("id");
            console.log(this.id);
            this.getObjectWithID(this.id);
        })
    }
    getObjectWithID(id) {
        this.studnetService.getObjectByID(id)
            .then((r) => {
                this.studentArray = r;
                console.log(this.studentArray);
                this.student=this.studentArray[0];
                if(this.student.isMale){
                    this.gender="true";
                }
                else{
                    this.gender="false";
                }
            })
    }
    ngOnInit(): void {
        
    }

    submit() {
        if(this.gender=="true"){
            this.student.isMale=true;
        }
        else{
            this.student.isMale=false;
        }
        this.studnetService.putData(this.id,this.student)
        .then((r)=>{
            console.log(r);
            this.router.navigate(['/display']);
        })
        
        
    }
    


}