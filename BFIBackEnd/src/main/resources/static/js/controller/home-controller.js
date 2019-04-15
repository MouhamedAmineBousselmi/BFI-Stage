app.controller("homeController",function ($scope,$http,$interval,AuthService,$firebaseArray) {
    $scope.compte = {decouvert:0,taux:0};
    $scope.operation = {typeO:"versement",montant:0,cpte2:null};
    $scope.codeCompte = null;
    $scope.pageOperations = [];
    $scope.pageCourante = 0;
    $scope.pageSize = 6;
    $scope.pages = [];
    $scope.erreurMessageHome = null;
    $scope.erreurMessageHomeOperation = null;
    $scope.format = 'MM/dd/yyyy HH:mm:ss a';
    $scope.agence =  {};
    $scope.codeEmp = null;
    $scope.nomEmp = null;
    //$scope.token = null;
    $scope.connected = false;

    var fireRef = new Firebase('https://banquesi-c7a86.firebaseio.com/todos');
    $scope.todos = $firebaseArray(fireRef);
    $scope.infoEmploye = function () {
        $http({
            method: 'GET',
            url: '/whoami'
        }).then(function successCallback(response) {
            $scope.agence.nomAgence= response.data.nomAgenceAppartient;
            $scope.agence.heureOuverture= response.data.oagenceAppartient;
            $scope.agence.heureFermeture= response.data.fagenceAppartient;
            $scope.codeEmp = response.data.codeEmploye;
            $scope.nomEmp = response.data.username;
            $scope.connected = true;
            $scope.addstat($scope.connected,$scope.nomEmp);
        }, function errorCallback(response) {
            console.log(response.data);
        });
    };

    //--firebase
    $scope.addstat = function(conn,nom){
        var connect = conn;
        var nomEmp = nom;
        // push to firebase
        $scope.todos.$add({
            title: "l'employe "+nomEmp+" vien de se connecter",
            completed: connect,
            type:"connection"
        });
    };
    //--//

    $scope.chargerCompte = function () {
        $scope.pageCourante = 0;

        $http({
            method: 'GET',
            url: '/comptes/'+$scope.codeCompte
        }).then(function successCallback(response) {
            $scope.erreurMessageHome= response.data.message;
            $scope.compte = response.data;
            $scope.chargerOperations();
        }, function errorCallback(response) {

            $scope.erreurMessageHome = response.data.message;
        });
    };

    $scope.saveOperation = function () {
        var params = "";
        $scope.aux = null;
        if($scope.operation.typeO === 'virement'){
            params = "cp1="+$scope.codeCompte+"&cp2="+$scope.operation.cp2+"&montant="+$scope.montant+"&codeEmp="+$scope.codeEmp;
        }else{
            params = "code="+$scope.codeCompte+"&montant="+$scope.operation.montant+"&codeEmp="+$scope.codeEmp;
        }
        $http({
            method: 'PUT',
            url: "/"+$scope.operation.typeO,
            data: params,
            headers: {'Content-Type':'application/x-www-form-urlencoded'}

        })
            .then(function successCallback(response){
                $scope.erreurMessageHomeOperation = response.data.message;
                $scope.addTodo($scope.operation.typeO,$scope.operation.montant);
                $scope.chargerCompte();
            },function (response) {
            });
    };

    //--FIREBASE

    $scope.addTodo = function(typeO,montant){
        var typeOF = typeO;
        var montantOF = montant;
        if (!typeOF.length && !montantOF.length) {
            return;
        }
        // push to firebase
        $scope.todos.$add({
            title: "un "+typeOF+" de "+montantOF+" est passe",
            completed: true,
            type:typeO
        });
        $scope.newTodo = '';
    };

    //--END FIREBASE

    $scope.chargerOperations = function () {
        $scope.errorMessage = null;
        $http({
            method: 'GET',
            url: '/operations?codeCompte='+$scope.codeCompte+"&codeEmp="+$scope.codeEmp+"&page="+$scope.pageCourante+"&size="+$scope.pageSize
        }).then(function successCallback(response) {
            console.log(response.data);
            $scope.pageOperations= response.data.opr.content;
            $scope.pages = new Array(response.data.opr.totalPages);

        }, function errorCallback(response) {
            console.log(response.data);
            console.log(response.data.totalPages);
        });
    };
    $scope.goToPage = function (p) {
        $scope.pageCourante = p;
        $scope.chargerOperations();
    };

}) .directive('myCurrentTime', ['$interval', 'dateFilter',
    function($interval, dateFilter) {
        return function(scope, element, attrs) {
            var format,
                stopTime;

            function updateTime() {
                element.text(dateFilter(new Date(), format));
            }

            scope.$watch(attrs.myCurrentTime, function(value) {
                format = value;
                updateTime();
            });

            stopTime = $interval(updateTime, 1000);

            element.on('$destroy', function() {
                $interval.cancel(stopTime);
            });
        }
    }]);
