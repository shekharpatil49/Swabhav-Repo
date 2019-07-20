import { Component, OnInit, Input ,Output} from '@angular/core';
import { EventEmitter } from '@angular/core';

@Component({
    selector: 'btn-toggle',
    templateUrl: 'btntoggle.component.html'
})
export class BtnToggleComponent {
    @Input()
    valueForText:String;
    @Input()
    OnColor:String;
    @Input()
    OffColor:String;
    @Output()
    stateChange:EventEmitter<String>;
    status:boolean=false;

    constructor(){
        console.log("inside constructor");
        this.valueForText="";
        this.OnColor="";
        this.OffColor="";
        this.stateChange=new EventEmitter<String>();
    }
    onInit(){
        console.log("inside on Init");
        console.log(this.valueForText);
        console.log(this,this.OnColor);
    }

    clickHandler(e){
        console.log(e);
        console.log("clicked");
        if(this.status==false){
            console.log("btn on");
            this.status=true;
            this.OnColor="green";
            this.stateChange.emit("stateChange firing:ON");
        }
        else{
            console.log("btn off");
            this.status=false;
            this.OnColor="red";
            this.stateChange.emit("stateChange firing:OFF");
        }
    }
}