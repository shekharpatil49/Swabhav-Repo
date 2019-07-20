import { HttpClient } from "@angular/common/http";
import { Injectable } from '@angular/core';


@Injectable()
export class StudentService {
    
    constructor(private http : HttpClient){
        
    }

    getFacts(){
        return this.http.get("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students")
        .toPromise();

    }

    postData(obj){

        return this.http.post("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students",obj)
        .toPromise();
    }

    deleteDataFromStudentArray(id){
        return this.http.delete("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/"+id)
        .toPromise();
    }

    getObjectByID(n){
        return this.http.get("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/"+n)
        .toPromise();
    }

    putData(id,obj){
        return this.http.put("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/"+id,obj)
        .toPromise();
    }
   
}