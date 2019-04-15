var app = angular.module("ClientApp",['ngRoute']);
app.config(function($routeProvider,$locationProvider) {
    $locationProvider.hashPrefix('');
    $routeProvider
        .when("/login", {
            templateUrl : "../login.html",
            controller:"loginController"
        })
        .when("/home", {
            templateUrl : "../home.html",
            controller:"homeController"
        })
        .otherwise({redirectTo:'/'});
});