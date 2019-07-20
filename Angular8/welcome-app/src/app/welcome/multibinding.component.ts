import { Component } from '@angular/core';
import { NumberAPIService } from '../service/NumberAPIService';

@Component({
    selector:'aurionpro-multibind',
    templateUrl:'./multibinding.component.html'
    
})
export class MultiBindingComponent{
 result:any;
 no:number;
 res:any;
 constructor(private numberApi:NumberAPIService){}
    
      getFact(no){
          this.numberApi.getFacts(no)
          .then((r)=>{
              this.result=r;
              console.log(this.result);
          })
          .catch((e)=>{
              this.result=e;
          })
          
      }
  }
