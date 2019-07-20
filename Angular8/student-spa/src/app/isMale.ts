import { Pipe,PipeTransform } from '@angular/core';

@Pipe({name:'ismale1'})
export class IsMale implements PipeTransform{
    transform(isMale:boolean):string{

        if(isMale){
            return "Male";
        }
        else{
            return "Female";
        }
    }
}