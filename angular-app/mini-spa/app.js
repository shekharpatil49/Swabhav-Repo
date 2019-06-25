angular.module('spa', ['ngRoute'])
    .config(function ($routeProvider) {
        $routeProvider
            .when("/", {
             
                templateUrl : "fragments/history.html",
                controller: 'HistoryController'
            })
            .when("/politics", {
              
                templateUrl : "fragments/politics.html",
                controller: 'PoliticsController'
            })
            .when("/places", {
             
                templateUrl : "fragments/places.html",
                controller: 'PlacesController'
            })

    })
    .controller('HistoryController',function($scope){
        $scope.data="he decade that brought us Star Trek and Doctor Who also resurrected Cicero—or at least what used to be Cicero—in anattempt to make the days before computerized design a little less painstaking."
    })
    .controller('PoliticsController',function($scope){
        $scope.data1="The French lettering company Letraset manufactured a set of dry-transfer sheets which included the lorem ipsum"
    })
    .controller('PlacesController',function($scope){
        $scope.data2="One word of caution: make sure your client knows that lorem ipsum is filler text. You don't want them wondering"
    })


