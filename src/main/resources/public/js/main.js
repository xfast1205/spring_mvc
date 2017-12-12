var app = angular.module("springTest", []);

app.controller("AppCtrl", function ($scope) {
    $scope.websites = [{
        iconImageUrl:'',
        id: 'stackoverflow',
        website: 'stackoverflow.com',
        title:'stackoverflow website',
        description:'stackoverflow description'
    }];

})