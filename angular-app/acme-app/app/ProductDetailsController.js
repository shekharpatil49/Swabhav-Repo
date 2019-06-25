angular.module('app')
.controller('ProductDetailsController',function($scope,$rootScope){
    
    $rootScope.displayDetails=function(index){
        
              $rootScope.productDetails=$rootScope.productArray[index];
              $rootScope.productId=$scope.productDetails.productId;
              console.log($scope.productId);
              $rootScope.productName1=$scope.productDetails.productName;
              console.log($scope.productName1);
              $rootScope.productCode=$scope.productDetails.productCode;
              $rootScope.releaseDate=$scope.productDetails.releaseDate;
              $rootScope.description=$scope.productDetails.description;
              $rootScope.price=$scope.productDetails.price;
              $rootScope.starRating=$scope.productDetails.starRating;
              $rootScope.imageUrl=$scope.productDetails.imageUrl;
       
    }
})
