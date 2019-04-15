/**
 * Created by amino on 21/08/2017
 */

app.controller("loginController",['$scope','$http','$location','$rootScope','$httpParamSerializerJQLike',function ($scope,$http,$location,$rootScope,$httpParamSerializerJQLike) {
    $scope.loginParams = true;
    $scope.credentials= {};
    $scope.errorMessageLogin = null;
    $scope.authentifier = function () {
        console.log($scope.credentials);
        $http({
            url: '/login',
            method: 'POST',
            data: $httpParamSerializerJQLike($scope.credentials),
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded'
            }
        })
            .then(function(res) {
                $http.defaults.headers.common.Authorization = 'Bearer '+res.data.access_token;

                console.log(res.data);
                $rootScope.authenticated = true;
                $rootScope.$broadcast('LoginSuccessful');
                $location.path("/home");

            })
            .catch(function(res) {
                $rootScope.authenticated = false;
                $scope.errorMessageLogin = res.data.message;
                console.log(res.data);
            });

    };
}]);