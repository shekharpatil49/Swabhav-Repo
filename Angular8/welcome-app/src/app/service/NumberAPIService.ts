
import { HttpClientModule, HttpClient } from "@angular/common/http";
import { Injectable } from '@angular/core';



@Injectable()
export class NumberAPIService{
    
    constructor(private http : HttpClient){}
    getFacts(no){
        return this.http.get("http://numbersapi.com/"+no,{responseType:"text"})
        .toPromise();

    }
}