
var exec = require('cordova/exec');

var PLUGIN_NAME = 'MiPlugin';

var MiPlugin = {
    listenTextSelectionAction: function (successCallback, errorCallback) {
        exec(successCallback, errorCallback, PLUGIN_NAME, "listenTextSelectionAction");
    }
};

module.exports = MiPlugin;
