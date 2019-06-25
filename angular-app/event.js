
        var app=  angular.module('studentApp',[])
          .controller('studentController',['$scope','$timeout',function($scope,$timeout){
            $scope.display = function () {
                $scope.student = {
                    id: 10,
                    name: "Ram",
                    image: "Demo_267840.png",
                    cgp: 8.2
                }

            }
            $timeout(function () {
                    $scope.student = {
                    id: 10,
                    name: "Ram1",
                    image: "Demo_267840.png",
                    cgp: 8.2
                }
                }, 3000);   

         } ])
          