 app.controller('relogioController', function($scope, $http) {
 
     $scope.relogio = {
            hora : "",
            minuto : ""
     };
 
     $scope.calcularAngulo = function() {
            if ($scope.relogio.hora>24) {
                   alert("Valor incorreto no campo Hora!");
                   return;
            }
			  if ($scope.relogio.minuto>60) {
                   alert("Valor incorreto no campo minuto!");
                   return;
            }
			
            $http.get('apirest/clock/'+ $scope.relogio.hora +'/'+$scope.relogio.minuto).success(function(data) {
                   console.log(data);
 
			  $("#modal-validacao").modal("show");
              $scope.txtModal = data.angulo;
            });
     }
 });