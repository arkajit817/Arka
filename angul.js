/**
 * 
 */
var app = angular.module("app",[]);






app.controller('ctrl', function($scope,$window){
	
	
	$scope.register = function () {
		
		$window.location.href = '/MSD/Register.jsp';
	}
})





	


