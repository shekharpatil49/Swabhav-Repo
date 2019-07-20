//console.log(window);
var x =20;
console.log("Hello World");
console.log(this);
f1();
function f1(){
    console.log("Inside f1")
}

let f2 = function(){
    console.log("Inside f2");


}
f2();
console.log(global);
