class Customer {
   
    private _id:number;
    private _firstName : String;

    private _lastName : String;

    constructor(id:number , firstName:String ,lastName:String ){
        this._id=id;
        this._firstName=firstName;
        this._lastName=lastName;
    }

    public get FirstName (){
        return this._firstName;
    }

    public set FirstName(fname){
        this._firstName =fname;
    }

}
let c1 = new Customer(101,"Shekhar","Patil");

console.log(c1.FirstName);
c1.FirstName="Ram";
console.log(c1.FirstName);