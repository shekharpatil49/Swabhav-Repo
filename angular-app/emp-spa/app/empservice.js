angular.module('empApp')
.factory('EmployeeService',function(){
    var obj={}
    var employeeArray=[{
        id:1,
        name:"Onkar",
        dOj:"26/6/2019",
        salary:35000,
        designation:"Developer"

    },
    {
        id:2,
        name:"Yogita",
        dOj:"26/6/2019",
        salary:35000,
        designation:"Analyst"

    },
    {
        id:3,
        name:"Abhishek",
        dOj:"26/6/2019",
        salary:35000,
        designation:"Tester"

    }]
    obj.getEmployeeData=function(){
        return employeeArray;
    }
    obj.addIntoEmployeeArray=function(emp){
        employeeArray.push(emp);
    }
    obj.removeElement=function(x){
        employeeArray.splice(x, 1);
    }
    var dataStore=[];
    obj.getElementByID=function(emp){
        return employeeArray[emp];
    }
    obj.updateDataInArray=function(index,emp){
      employeeArray[index]=emp;
    }
    return obj;
})