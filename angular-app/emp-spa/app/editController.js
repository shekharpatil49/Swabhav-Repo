angular.module('empApp')
    .controller('editController', ['EmployeeService', '$scope', '$routeParams', '$location', '$rootScope', function (EmployeeService, $scope, $routeParams, $location, $rootScope) {
        function onload() {
            if (!$rootScope.adminFlag) {
                $location.path('/')
            } else {

                $scope.index = $routeParams.id;
                console.log($scope.index);
                var emp = EmployeeService.getElementByID($scope.index);

                $scope.id = emp.id;
                $scope.name = emp.name;
                $scope.date = emp.dOj;
                $scope.salary = emp.salary;
                $scope.selectedData = emp.designation;



                $scope.updateData = function () {

                    $scope.emp = {
                        id: $scope.id,
                        name: $scope.name,
                        dOj: $scope.date,
                        salary: $scope.salary,
                        designation: $scope.selectedData
                    }
                    EmployeeService.updateDataInArray($scope.index, $scope.emp);


                }

            }
        }
        onload();


    }]);