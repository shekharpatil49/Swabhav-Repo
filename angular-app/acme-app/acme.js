angular.module('app', ['ngRoute'])
.config(function ($routeProvider) {
        $routeProvider
            .when("/", {
                templateUrl: "app/home.html",
                controller: 'welcomeController'
            })
            .when("/productlist", {
                templateUrl: "app/productlist.html",
                controller: 'ProductListController'
            })
            .when("/productdetails", {
                templateUrl: "app/productdetails.html",
                controller: 'ProductDetailsController'
            })

    });