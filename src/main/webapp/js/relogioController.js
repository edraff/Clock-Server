 app.controller('relogioController', function($scope, $http) {
 
     $scope.relogio = {
            hora : "",
            minuto : "",
            txtResultado: ""
     };
 
     $scope.calcularAngulo = function() {
            if ($scope.relogio.hora < 0 && $scope.relogio.hora > 24) {
                alert("Valor incorreto no campo Hora!");
                return;
            }
			else if ($scope.relogio.minuto < 0 && $scope.relogio.minuto > 60) {
                alert("Valor incorreto no campo minuto!");
                return;
            }			
            else{
                $http.get('apirest/clock/'+ $scope.relogio.hora +'/'+$scope.relogio.minuto).
                 then(
                    function(response) {
                        if(response.data){                                                  
                            $scope.relogio.txtResultado = response.data.angulo;                        
                        }
                    
                });
            }
     }
 });