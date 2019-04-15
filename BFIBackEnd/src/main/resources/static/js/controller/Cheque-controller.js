/**
 * Created by amino on 19/07/2017
 */

app.controller("chequeController",function ($scope,$http,AuthService,$firebaseArray) {

    $scope.cheque = {};

    $scope.codeEmploye = 0;
    $scope.pageOperations = [];
    $scope.pageCourante = 0;
    $scope.pageSize = 6;
    $scope.pages = [];
    $scope.erreurMessageCheque = null;

    $scope.verserCheque= function () {
        $http({
            method: 'PUT',
            url: '/cheque',
            data: "montant="+parseFloat($scope.cheque.montant)+
                   "&compte="+$scope.cheque.compte+
                  "&nomProprietaire="+$scope.cheque.nomProprietaire+
                  "&numeroC="+parseFloat($scope.cheque.numeroC)+
                  "&prenomProprietaire="+$scope.cheque.prenomProprietaire+
                  "&employe="+$scope.codeEmploye,
            headers: {'Content-Type':'application/x-www-form-urlencoded'}
        }).then(function (response) {
            $scope.erreurMessageCheque = response.data.message;
            $scope.addTodo($scope.cheque.numeroC,$scope.cheque.compte,$scope.cheque.montant);
            $scope.infoCheques();
        }, function (response) {
            console.log(response.data);
            $scope.erreurMessageCheque = response.data.message;
        });
    };


    //--FIREBASE
    var fireRef = new Firebase('https://banquesi-c7a86.firebaseio.com/todos');
    $scope.todos = $firebaseArray(fireRef);

    $scope.addTodo = function(numero,compte,montant){
        var numeroCF = numero;
        var montantCF = montant;
        var compteCF = compte;
        if (!numeroCF.length && !montantCF.length && !compteCF.length) {
            return;
        }
        // push to firebase
        $scope.todos.$add({
            title: "numero:"+numeroCF+" montant:"+montantCF+" compte:"+compteCF,
            completed: true,
            type:"Versement cheque"
        });
        $scope.newTodo = '';
    };
    //--END FIREBASE

    $scope.infoCheques= function () {
        $http({
            method: 'GET',
            url: '/whoami'
        }).then(function successCallback(response) {
            $scope.codeEmploye = response.data.codeEmploye;
            $scope.chargerCheques();
        }, function errorCallback(response) {
        });
    };

    $scope.chargerCheques = function () {
        $http({
            method: 'GET',
            url: '/cheques?codeEmploye='+$scope.codeEmploye+"&page="+$scope.pageCourante+"&size="+$scope.pageSize
        }).then(function successCallback(response) {
            console.log(response.data);
            $scope.pageOperations= response.data.opr.content;
            $scope.pages = new Array(response.data.opr.totalPages);
        }, function errorCallback(response) {
            console.log(response.data);
        });
    };
    $scope.goToPage = function (p) {
        $scope.pageCourante = p;
        $scope.chargerCheques();
    };
});