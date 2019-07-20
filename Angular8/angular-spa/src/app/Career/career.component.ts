import { Component } from "@angular/core";
import { ActivatedRoute, ParamMap } from '@angular/router';

@Component({

    selector:'career',
    templateUrl: './career.component.html'

})
export class CareerComponent{

    id:string;

    constructor( private route: ActivatedRoute,
      ) {
        this.route.paramMap.subscribe(param=>{
        this.id=param.get("id");
        console.log(this.id);
      })
    }

}