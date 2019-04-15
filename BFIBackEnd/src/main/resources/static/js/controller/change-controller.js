/**
 * Created by amino on 13/07/2017
 */
app.controller("changeController",function ($scope,$http,AuthService,$firebaseArray) {
    $scope.montantC = 0;
    $scope.result = 0;
    $scope.change = {montant:0};
    $scope.param = "";
    $scope.codeEmploye = 0;
    $scope.pageOperations = [];
    $scope.pageCourante = 0;
    $scope.pageSize = 6;
    $scope.pages = [];

    $scope.erreurMessageChange = null;

    $scope.convertir = function () {
        $http({
            method: 'POST',
            url: '/convertir',
            data: parseFloat($scope.montantC)
        }).then(function (response) {
            $scope.result = response.data.montant;
            $scope.erreurMessageChange = response.data.message;
        }, function (response) {
            $scope.erreurMessageChange = response.data.message;
        });
    };
    $scope.convertirF = function () {
        $http({
            method: 'POST',
            url: '/convertir',
            data: parseFloat($scope.montantF)
        }).then(function (response) {
            $scope.change.montant = response.data.montant;
            $scope.erreurMessageChange = response.data.message;
        }, function (response) {
            $scope.erreurMessageChange = response.data.message;
        });
    };

    $scope.convertirR = function () {
        $http({
            method: 'POST',
            url: '/convertirR',
            data: parseFloat($scope.montantA)
        }).then(function (response) {
            $scope.change.montant = response.data.montant;
            $scope.erreurMessageChange = response.data.message;
        }, function (response) {
            $scope.erreurMessageChange = response.data.message;
        });
    };

    $scope.changer = function () {
        if($scope.achat ="achat"){
            $scope.param = "achat";
            $scope.vente = null;
        }else{
            $scope.param= "vente";
            $scope.achat =null;
        }
        $http({
            method: 'PUT',
            url: '/'+$scope.param,
            data: "adresseP="+$scope.change.adresseP+
                  "&destination="+$scope.change.destination+
                  "&identif="+$scope.change.identif+
                  "&montant="+$scope.change.montant+
                  "&nomP="+$scope.change.nomP+
                  "&prenomP="+$scope.change.prenomP+
                  "&employe="+$scope.codeEmploye,
            headers: {'Content-Type':'application/x-www-form-urlencoded'}
        }).then(function (response) {
            $scope.addTodo($scope.param,$scope.change.montant);
            $scope.erreurMessageChange = response.data.message;
            console.log(response.data);
            $scope.infoChange();
        }, function (response) {
            $scope.erreurMessageChange = response.data.message;
        });
    };

    //--FIREBASE
    var fireRef = new Firebase('https://banquesi-c7a86.firebaseio.com/todos');
    $scope.todos = $firebaseArray(fireRef);

    $scope.addTodo = function(type,montant){
        var typeCF = type;
        var montantCF = montant;
        if (!typeCF.length && !montantCF.length) {
            return;
        }
        // push to firebase
        $scope.todos.$add({
            title: "un "+typeCF+" de montant "+montantCF,
            completed: true,
            type:"ACHAT/VENTE DEVISE"
        });
        $scope.newTodo = '';
    };
    //--END FIREBASE

    $scope.infoChange = function () {
        $http({
            method: 'GET',
            url: '/whoami'
        }).then(function successCallback(response) {
            $scope.codeEmploye = response.data.codeEmploye;
            $scope.chargerChanges();
        }, function errorCallback(response) {
            console.log(response.data);
        });
    };

    $scope.chargerChanges = function () {
        $http({
            method: 'GET',
            url: '/changes?codeEmploye='+$scope.codeEmploye+"&page="+$scope.pageCourante+"&size="+$scope.pageSize
        }).then(function successCallback(response) {
            $scope.pageOperations= response.data.opr.content;
            $scope.pages = new Array(response.data.opr.totalPages);
            console.log(response.data);
        }, function errorCallback(response) {
            console.log(response.data);
            console.log(response.data.opr.totalPages);
        });
    };
    $scope.goToPage = function (p) {
        $scope.pageCourante = p;
        $scope.chargerChanges();
    };
});