var cordova = require('cordova'),
    exec = require('cordova/exec');

module.exports =  {
	onKeyUp : function(successCallback, errorCallback){
		return exec(successCallback, errorCallback, "Keyboard", 'register_keyUp', []);
	},
	onKeyDown : function(successCallback, errorCallback){
		return exec(successCallback, errorCallback, "Keyboard", 'register_keyDown', []);
	}
}