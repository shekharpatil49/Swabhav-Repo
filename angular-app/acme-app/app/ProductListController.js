angular.module('app')
.controller('ProductListController',function($scope,$http,$rootScope,$sce){


   $http.get("app/products.json").then(function(response){
       $rootScope.productArray=response.data;
       console.log($rootScope.productArray);
   })

   
   $scope.displayImg=function(){
       $scope.displayImage=!$scope.displayImage;
   }
  
})
.directive('star',function($sce){
    var directive ={
        template:'<i class="fa fa-star" aria-hidden="true"></i>',
        restrict:'E'
    };
    return directive;
})
.filter('Starfilter',function($sce){
    return function (input){
        let images="";
        let index;
        for(index=1;index<input;index++){
            images=images+'<i class="fa fa-star" aria-hidden="true"></i>'
        }
        index--;
        let temp=input-index;
        if(temp>0){
            index++;
            imgaes=images+'<i class="fa fa-star-half" aria-hidden="true"></i>'
        }
        return $sce.trustAsHtml(images);
    }
})