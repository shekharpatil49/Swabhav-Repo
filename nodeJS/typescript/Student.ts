export class Student{
    constructor(private roll_no:number,private firstName:String,private lastName:String ){
       this.roll_no=roll_no;
       this.firstName=firstName;
       this.lastName=lastName;
    }

    public get RollNo(){
        return this.roll_no;
    }
    public get FirstName(){
        return this.firstName;
    }
    public get LastName(){
        return this.lastName;
    }
}

export class Address{

    constructor(private street:String){
        this.street=street;
    }

    public get Street(){
       return this.street;
    }
}

