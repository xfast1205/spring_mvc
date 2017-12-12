var app = angular.module("springTest", []);

app.controller("AppCtrl", function ($scope, $http) {
    $scope.websites = [];

    $http.get('http://localhost:8090/api/overflow').then(function(response) {
        $scope.websites = response.data;
    })
})