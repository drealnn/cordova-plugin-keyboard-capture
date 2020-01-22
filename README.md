# cordova-plugin-keyboard-capture
Phonegap/Cordova based plugin for registering key events on Android devices. Uses modified webview implementation for capturing key events on later Android releases.
On later Android releases, the given cordova webview doesn't properly register key events for all keys. 
This plugin replaces the default cordova webview implementation with a custom implementation that registers key events to a custom key listener.
This may be used for registering key/trigger events of modern Android based RFID/barcode scanning devices, but should support any hardware based keyboard.

Developed by Simplicity Solutions Group

https://simplicitysolutionsgroup.com/

## Questions?
Contact us at:

dsledd@simplicitysolutionsgroup.com

jfairfull@simplicitysolutionsgroup.com

## Installing:


## Methods:

```
keyboardCapture {
	onKeyUp : function(successCallback, errorCallback){
		exec(successCallback, errorCallback, "Keyboard", 'register_keyUp', []);
	},
	onKeyDown : function(successCallback, errorCallback){
		exec(successCallback, errorCallback, "Keyboard", 'register_keyDown', []);
	}
}

```

## Example Use
```
keyboardCapture.onKeyDown(function(response){
	console.log(response.keyCode);
	console.log(response.repeatCount);
});

keyboardCapture.onKeyUp(function(response){
	console.log(response.keyCode);
	console.log(response.repeatCount);
});
```
