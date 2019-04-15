/**
 * Created by amino on 26/06/2017
 */
app.controller("mainController",function ($scope,$route,$location,AuthService,$firebaseArray,$timeout) {

    $scope.messages = [];
    $scope.$route = $route;
    $scope.logout = function () {
        AuthService.user = null;
        $scope.credentials = null;
        $location.url("/");
    };
    $scope.$on('LoginSuccessful', function() {
        $scope.user = AuthService.user;

        var fireRef = new Firebase('https://banquesi-c7a86.firebaseio.com/messages');
        $scope.messages = $firebaseArray(fireRef);

        $scope.messages.$loaded().then(function(messages) {
            $timeout(function () {
                for(var j = 0  ; j< messages.length ; j++) {
                    messages.$remove(messages[j]);
                }
            }, 18000);

        });
    });

    $scope.sendMessage = function () {
        $scope.messages.$add({
            from: AuthService.user.username,
            content: $scope.message
        });
        $scope.message = "";
    };

});