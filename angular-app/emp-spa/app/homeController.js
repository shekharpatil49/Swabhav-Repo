angular.module('empApp')
.controller('homeController',['EmployeeService','$scope','$rootScope',function(EmployeeService,$scope){
    $scope.employees=EmployeeService.getEmployeeData();
    $scope.noOfEmployees=$scope.employees.length;
    console.log($scope.employees);
   
    $scope.deleteData=function(x){
       EmployeeService.removeElement(x);
       $scope.noOfEmployees=$scope.employees.length;
    }
    $scope.editData=function(x){
        
    }
}]);
