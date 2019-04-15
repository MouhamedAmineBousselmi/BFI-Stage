/**
 * Created by amino on 05/08/2017
 */
app.controller("taskController",function ($http,$scope,$filter,$firebaseArray) {

    $scope.currentOper = {};
    $scope.codeEmploye = 0;
    $scope.pageCourante = 0;
    $scope.pageSize = 100;
    $scope.erreurMessageTaches = null;
    $scope.test = null;
    $scope.pageOperations = [];
    $scope.pages = [];

    $scope.infoTaches= function () {
        $http({
            method: 'GET',
            url: '/whoami'
        }).then(function successCallback(response) {
            $scope.codeEmploye = response.data.codeEmploye;
            $scope.chargerTaches();
        }, function errorCallback(response) {
        });
    };


    $scope.chargerTaches = function () {
        $http({
            method: 'GET',
            url: '/taches?codeEmploye='+$scope.codeEmploye+"&page="+$scope.pageCourante+"&size="+$scope.pageSize
        }).then(function successCallback(response) {
            $scope.pageOperations = response.data.opr.content;
            $scope.pages = new Array(response.data.opr.totalPages);
        }, function errorCallback(response) {
            console.log(response.data);
        });
    };
    $scope.goToPage = function (p) {
        $scope.pageCourante = p;
        $scope.chargerTaches();
    };



    $scope.oke = function (p,op) {
        $scope.test = p;
        $scope.currentOper = op;
        if(!$scope.test){
            $scope.currentOper.status = true;

            $scope.startDate = $filter('date')($scope.currentOper.startDate, "yyyy-MM-dd");
            $scope.deadline = $filter('date')($scope.currentOper.deadline, "yyyy-MM-dd");
            console.log($scope.startDate);
            $http({
                method: 'PUT',
                url: 'updatetask',
                data: "idTask="+$scope.currentOper.idTask+
                "&status="+$scope.currentOper.status+
                "&taskName="+$scope.currentOper.taskName+
                "&priority="+$scope.currentOper.priority+
                "&startDate="+$scope.startDate+
                "&taskMessage="+$scope.currentOper.taskMessage+
                "&deadline="+$scope.deadline+
                "&nextStep="+$scope.currentOper.nextStep+
                "&employe="+$scope.codeEmploye+
                "&taskType="+$scope.currentOper.taskType,

                headers: {'Content-Type':'application/x-www-form-urlencoded'}
            }).then(function (response) {
                $scope.addTodo($scope.currentOper.taskName);
                console.log(response.data);
            }, function (response) {
                console.log(response.data);
            });
        }
    };

    //--FIREBASE
    var fireRef = new Firebase('https://banquesi-c7a86.firebaseio.com/todos');
    $scope.todos = $firebaseArray(fireRef);

    $scope.addTodo = function(TacheName){
        var newTodo = TacheName;
        if (!newTodo.length) {
            return;
        }
        // push to firebase
        $scope.todos.$add({
            title: "La tache "+newTodo+" is done",
            completed: true,
            type:"Task"
        });
        $scope.newTodo = '';
    };
    //--END FIREBASE
});