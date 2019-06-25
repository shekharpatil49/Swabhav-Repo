angular.module('empApp')
    .controller('addController', ['EmployeeService', '$location','$scope','$rootScope', function (EmployeeService, $location,$scope,$rootScope) {

       function onload(){
        if($rootScope.adminFlag){
            $location.path('/add')
        }else{
            $location.path('/')
        }
       }
    onload();
        $scope.addData = function () {
            $scope.emp = {
                id: $scope.id,
                name: $scope.name,
                dOj: $scope.date,
                salary: $scope.salary,
                designation: $scope.selectedData
            }
            EmployeeService.addIntoEmployeeArray($scope.emp);
            
        }
    }]);