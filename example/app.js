// This is a test harness for your module
// You should do something interesting in this harness 
// to test out the module and to provide instructions 
// to users on how to use it by example.


// open a single window
var win = Ti.UI.createWindow({
	backgroundColor:'white'
});
var label = Ti.UI.createLabel({text:"launched by BootBroadcastReceiver module !"});
win.add(label);
win.open();

// no nead require() to use this module!
//var bootbroadcastreceiver = require('jp.isisredirect.bootbroadcastreceiver');


