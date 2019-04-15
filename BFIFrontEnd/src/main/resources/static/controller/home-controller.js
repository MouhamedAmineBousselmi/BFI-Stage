/**
 * Created by amino on 25/08/2017
 */

app.controller("homeController",['$scope','$http',function ($scope,$http) {

    $scope.codeClient = null;
    $scope.nbrVers = 0;
    $scope.nbrRetr = 0;
    $scope.nbrVir = 0;

    $scope.virementsList = [];
    $scope.versementList = [];
    $scope.retraitList = [];

    $scope.virementsListFinal = [];
    $scope.versementListFinal  = [];
    $scope.retraitListFinal  = [];

    $scope.comptes = [];
    $scope.infoClient = function () {
        $http({
            method: 'GET',
            url: '/whoami'
        }).then(function successCallback(response) {
            //console.log(response.data);
            $scope.codeClient = response.data.codeClient;
            $scope.comptes();
        }, function errorCallback(response) {
            console.log(response.data);
        });
    };

    $scope.comptes = function () {
        $http({
            method: 'GET',
            url: '/comptes/'+$scope.codeClient
        }).then(function successCallback(response) {
            console.log(response.data);
            $scope.comptes = response.data;
        }, function errorCallback(response) {
            console.log(response.data);
        });
    };

    $scope.nbrOper= function (operations) {

        for(var j = 0  ; j< operations.length; j++) {
            if(operations[j].typeO == 'V'){
                $scope.nbrVers++;
                $scope.versementList.push(operations[j]);
            }

            if(operations[j].typeO == 'R'){
                $scope.nbrRetr++;
                $scope.retraitList.push(operations[j]);
            }

            if(operations[j].typeO == 'VI'){
                $scope.nbrVir++;
                $scope.virementsList.push(operations[j]);
            }
        }
    };

}]);