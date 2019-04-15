/**
 * Created by amino on 25/08/2017
 */

app.controller("mainController",['$scope','$location',function ($scope,$location) {
    $scope.authentification = false;

    $scope.$on('LoginSuccessful', function() {
        $scope.authentification = true;
    });

    $scope.logout = function () {
        $location.url("/login");
        $scope.authentification = false;
    };
}]);