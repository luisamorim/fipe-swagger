angular.module("FipeService",[]);
angular.module('FipeService').run(function($http){
	console.log('FipeService init');
});
angular.module("FipeService").service('FipeService',function(){
	
	var host = "https://revendacars-service.cfapps.io/api/fipe"
	
			this.marcas = function(callback){
				var promisse = $http.get(host);
				promisse.then(function(response){
					callback(response.data)
				},function(error){
					console.log(error);
				});
			}
	
			this.modelos = function(marcaId,callback){
				var promisse = $http.get(host +'/' + marcaId);
				promisse.then(function(response){
					callback(response.data)
				},function(error){
					console.log(error);
				});
			}
			
			this.versoes = function(marcaId,modeloId,callback){
				var promisse = $http.get(host +'/'+ marcaId+'/'+modeloId);
				promisse.then(function(response){
					callback(response.data)
				},function(error){
					console.log(error);
				});
			}
			
			this.veiculo = function(marcaId,modeloId,versaoId,callback){
				var promisse = $http.get(host +'/'+ marcaId+'/'+modeloId+'/'+versaoId+'.json');
				promisse.then(function(response){
					callback(response.data)
				},function(error){
					console.log(error);
				});
			}
			
	
});