angular.module('app',['FipeService'])
	.controller('defaultCtrl',function($scope,$http,FipeService){
		$scope.marcas = [];
		$scope.selectedMarca = {
				"referencia" : "outubro de 2017",
				"fipeCodigo" : "008003-9",
				"name" : "80 2.8 Cabriolet",
				"combustivel" : "Gasolina",
				"marca" : "6",
				"anoModelo" : "1996",
				"preco" : "R$ 39.686,00",
				"key" : "80-1996",
				"time" : "0.0",
				"veiculo" : "80 2.8 Cabriolet",
				"id" : "1996",
				"modeloId" : "50",
				"versaoId" : "1996-1"
			};
		
		var loadMarcas = function(){
			FipeService.marcas(function(marcas){
				$scope.marcas = marcas;
			});
		}
		
		loadMarcas();
		
		
	});

