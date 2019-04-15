app.controller("loginController",function ($scope,$http,$location,$rootScope,$httpParamSerializerJQLike,AuthService) {
            $scope.loginParams = true;
            $scope.credentials= {};
            $scope.errorMessageLogin = null;

     $scope.authentifier = function () {
         $http({
             url: '/login',
             method: 'POST',
             data: $httpParamSerializerJQLike($scope.credentials),
             headers: {
                 'Content-Type': 'application/x-www-form-urlencoded'
           }
         })
             .then(function(res) {
                 $rootScope.authenticated = true;
                 AuthService.token = res.data.access_token;
                 $http.defaults.headers.common.Authorization = 'Bearer '+AuthService.token;
                 AuthService.user = $scope.credentials;
                 $rootScope.$broadcast('LoginSuccessful');
                 $location.path("/home");

             })
             .catch(function(res) {
                 $rootScope.authenticated = false;
                 $scope.errorMessageLogin = res.data.message;
                 console.log(res.data);
             });
     };
 });