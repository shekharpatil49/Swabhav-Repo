angular.module("empApp")
.controller("loginController",['EmployeeService','$rootScope','$scope','$window','$location',function(EmployeeService,$rootScope,$scope,$window,$location){
  
    $scope.login=function(){
        if($scope.login_id == parseInt($scope.password)){
           
            $rootScope.adminFlag=true;
            $rootScope.showlogin=true;
            $rootScope.userName=$scope.login_id;
            $location.path('/');
            $window.sessionStorage.login_id=$scope.login_id ;
            $window.sessionStorage.password=parseInt($scope.password);
            $rootScope.action=true;

        }
    }
    function loginDetails(){
        if($window.sessionStorage.login_id==123 && $window.sessionStorage.password==123){
            $scope.login_id = $window.sessionStorage.login_id;
            $scope.password= $window.sessionStorage.password;
            $scope.login();
        }
    }
    loginDetails();

    $rootScope.display=function(){
        $rootScope.adminFlag=false;
        $window.sessionStorage.login_id="";
        $window.sessionStorage.password="";
        $rootScope.showlogin=false;
    }
}])