var app = angular.module("myBanqueApp",['ngRoute','firebase']);
app.config(function($routeProvider, $locationProvider) {
    $locationProvider.html5Mode({
        enabled: true,
        requireBase: false
    });
    $routeProvider
        .when("/login", {
           templateUrl : "login.html",
            controller:"loginController"
       }) .when("/home", {
           templateUrl : "home.html",
           controller:"homeController"
        }).when("/change", {
            templateUrl : "change.html",
            controller:"changeController"
        }).when("/cheque", {
            templateUrl : "Cheque.html",
            controller:"chequeController"
        }).when("/taches", {
        templateUrl : "task.html",
        controller:"taskController"
    }).otherwise({redirectTo:'/'});
});